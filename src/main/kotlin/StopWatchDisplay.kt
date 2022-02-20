import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.awt.SystemColor.text

@Composable
fun stopWatchDisplay(formattedTime:String,
                     onStartClick: ()-> Unit,
                     onPauseClick: ()-> Unit,
                     onResetClick: ()-> Unit,
                     modifier: Modifier = Modifier){

    Column(
        modifier =modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier.height(16.dp))

        Text(
            text = formattedTime,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = Color.Black
        )
        Spacer(modifier.height(16.dp))


        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier.width(4.dp))

            Button(onStartClick){
                Text("Start Counter")
            }
            Spacer(modifier.width(16.dp))


            Button(onPauseClick){
                Text("Pause Counter")
            }
            Spacer(modifier.width(16.dp))



            Button(onResetClick){
                Text("Reset Counter")
            }
            Spacer(modifier.width(16.dp))






        }


    }

}