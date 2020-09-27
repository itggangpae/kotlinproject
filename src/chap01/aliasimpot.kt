package chap01

import java.util.Date as UtilDate
import java.sql.Date as SqlDate

import java.util.GregorianCalendar
fun main(args: Array<String>){
    val utilDate = UtilDate()
    val calendar = GregorianCalendar()
    val sqlDate = SqlDate(calendar.getTimeInMillis())

    println("UtilDate:"+utilDate); println("SqlDate:"+sqlDate)

}