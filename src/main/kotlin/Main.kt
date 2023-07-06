fun main(){
    val myBook=Books("Born a crime", "Trevor Noah", 400, "john Murray")

}

data class  Books(var title:String, var author:String, var pages:Int,var publisher:String){

 data class AgeStatus(var maxAge:Int,var minAge:Int,var averAge:Double)
    fun calc(ages:Array<Int>):AgeStatus{
        val min =ages.min()
        val max =ages.max()
        val avg=ages.average()

    }
}





