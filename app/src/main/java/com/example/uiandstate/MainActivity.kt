import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.SemanticsProperties.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import com.example.uiandstate.R
import java.lang.reflect.Modifier
import java.text.NumberFormat

fun main() {

    val resources

    <resources>

    <string name="app_name">Tip Time</string>
    <string name="calculate_tip">Calculate Tip</string>
    <string name="bill_amount">Bill Amount</string>
    <string name="tip_amount">Tip Amount: %s</string>
    </resources>

}

@Composable
fun TipTimeLayout() {
    Column(
        modifier = Modifier
            .statusBarsPadding()
            .padding(horizontal = 40.dp)
            .verticalScroll(rememberScrollState())
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.calculate_tip),
            modifier = Modifier
                .padding(bottom = 16.dp, top = 40.dp)
                .align(alignment = Alignment.Start)
        )
        Text(
            text = stringResource(R.string.tip_amount, "$0.00"),
            style = MaterialTheme.typography.displaySmall
        )
        Spacer(modifier = Modifier.height(150.dp))
    }
}

@Composable
fun Spacer(modifier: Any) {

}

private fun calculateTip(amount: Double, tipPercent: Double = 15.0): String {
    val tip = tipPercent / 100 * amount
    return NumberFormat.getCurrencyInstance().format(tip)
}

@Composable
fun EditNumberField(
    @StringRes label: Int,
    value: String,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        //...
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Next
        )
    )
}

@Composable
fun EditNumberField(
    @StringRes label: Int,
    keyboardOptions: KeyboardOptions,
    // ...
){
    TextField(
        //...
        keyboardOptions = keyboardOptions
    )
}

EditNumberField(
label = R.string.bill_amount,
keyboardOptions = KeyboardOptions.Default.copy(
keyboardType = KeyboardType.Number,
imeAction = ImeAction.Next
),
// ...
)

EditNumberField(
label = R.string.how_was_the_service,
keyboardOptions = KeyboardOptions.Default.copy(
keyboardType = KeyboardType.Number,
imeAction = ImeAction.Done
),
// ...
)

@Composable
fun RoundTheTipRow(modifier: Modifier = Modifier) {
}
Row(
    modifier = modifier
    .fillMaxWidth()
    .size(48.dp),
    verticalAlignment = Alignment.CenterVertically
) {
}

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size

Text(text = stringResource(R.string.round_up_tip))
        Switch(
            checked = roundUp,
            onCheckedChange = onRoundUpChange,
        )
        import androidx.compose.material3.Switch

@Composable
fun RoundTheTipRow(
    roundUp: Boolean,
    onRoundUpChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier
)

Switch(
modifier = modifier
.fillMaxWidth()
.wrapContentWidth(Alignment.End),
//...
)
import androidx.compose.foundation.layout.wrapContentWidth

fun TipTimeLayout() {
    //...
    var roundUp by remember { mutableStateOf(false) }

    //...
    Column(
        ...
    ) {
        //...
    }
}

@Composable
fun TipTimeLayout() {
    //...

    Column(
        ...
    ) {
        Text(
            ...
        )
        Spacer(...)
        EditNumberField(
            ...
        )
        EditNumberField(
            ...
        )
        RoundTheTipRow(
            roundUp = roundUp,
            onRoundUpChanged = { roundUp = it },
            modifier = Modifier.padding(bottom = 32.dp)
        )
        Text(
            ...
        )
    }
}
private fun calculateTip(
    amount: Double,
    tipPercent: Double = 15.0,
    roundUp: Boolean
): String {
    //...
}
if (roundUp) {
    tip = kotlin.math.ceil(tip)
}

private fun calculateTip(amount: Double, tipPercent: Double = 15.0, roundUp: Boolean): String {
    var tip = tipPercent / 100 * amount
    if (roundUp) {
        tip = kotlin.math.ceil(tip)
    }
    return NumberFormat.getCurrencyInstance().format(tip)
}
val tip = calculateTip(amount, tipPercent, roundUp)

@Composable
fun TipTimeLayout() {
    // ...
    Column(
        modifier = Modifier
            .padding(40.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        //...
    }
}
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

@Composable
fun EditNumberField(
    @StringRes label: Int,
    @DrawableRes leadingIcon: Int,
    keyboardOptions: KeyboardOptions,
    value: String,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier
)
import androidx.annotation.DrawableRes
import androidx.compose.material3.Icon

TextField(
value = value,
leadingIcon = { Icon(painter = painterResource(id = leadingIcon), null) },
//...
)
EditNumberField(
label = R.string.bill_amount,
leadingIcon = R.drawable.money,
// Other arguments
)
EditNumberField(
label = R.string.how_was_the_service,
leadingIcon = R.drawable.percent,
// Other arguments
)


