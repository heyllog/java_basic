import groovy.sql.Sql
import java.text.SimpleDateFormat

println "\n-------------------------------Task1.8-------------------------------\n"
//FirstClass firstClass = new FirstClass(id: 1, nickname: 'sadgdsg')
User firstClass = new User(38, 'nickname')
println firstClass

println "\n-------------------------------Task1.9-------------------------------\n"
Binding binding = new Binding()
binding.setVariable("id", 34)
binding.setVariable("nickname", "new nickname")
firstClass.fromBinding(binding)
println firstClass

println "\n-------------------------------Task1.10------------------------------\n"
String test1 = "sdfg"
Integer test2 = 2314
println test1 instanceof String
println test1 instanceof Integer
println test2 instanceof Integer
println test2 instanceof String

println "\n-------------------------------Task1.12------------------------------\n"
println firstClass.sum(42, 20)

println "\n-------------------------------Task2.1-------------------------------\n"

int method1(Integer num) {
    try {
        return num
    } catch (Exception e) {
        e.printStackTrace()
        return 0
    }
}

Integer method2(Integer num) {
    return num
}

println 'int:' + method1(null)
println 'Integer: ' + method2(null)

println "\n-------------------------------Task2.2-------------------------------\n"
BigDecimal bigDecimal1 = new BigDecimal(42.2134)
BigDecimal bigDecimal2 = new BigDecimal(42.2134)

println bigDecimal1.equals(bigDecimal2)
println bigDecimal1.is(bigDecimal2)
println bigDecimal1 == bigDecimal2

println "\n-------------------------------Task2.3-------------------------------\n"
println bigDecimal1.add(bigDecimal2)
println bigDecimal1 + bigDecimal2
println bigDecimal1.divide(bigDecimal2)
println bigDecimal1 / bigDecimal2
println bigDecimal1.multiply(bigDecimal2)
println bigDecimal1 * bigDecimal2

println "\n-------------------------------Task2.4-------------------------------\n"
def variable = 10
println variable + ', ' + variable.getClass()
variable = 'f'
println variable + ', ' + variable.getClass()
variable = 'First'
println variable + ', ' + variable.getClass()
variable = 223148
println variable + ', ' + variable.getClass()

println "\n-------------------------------Task2.5-------------------------------\n"
Calendar date1 = Calendar.getInstance()
Calendar date2 = Calendar.getInstance()
SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy")
date1.setTime(dateFormat.parse("28.02.2015"))
date2.setTime(dateFormat.parse("31.01.2015"))
println date1 - date2
date1.add(Calendar.MONTH, -1)
println date1.getTime()
date1.add(Calendar.DAY_OF_MONTH, 1)
println date1.getTime()
date1.add(Calendar.MONTH, 1)
println date1.getTime()

println "\n--------------------------------Task3--------------------------------\n"
def division = { b, c ->
    return b / c
}

def minus = { d, c ->
    return d - c
}

def divisionMinus = { d, b, c ->
    return minus(division(d, b), c)
}

println(division(20, 5))
println(minus(20, 5))
println(divisionMinus(20, 10, 3))

println "\n--------------------------------Task4--------------------------------\n"
String url = "jdbc:mysql://localhost/mysql?serverTimezone=Europe/Moscow"

Sql sql = Sql.newInstance(url, "root", "1234", "com.mysql.cj.jdbc.Driver")

def rows = sql.rows("select * from item where ITEM_ID<4")
println rows.join('\n')

//sql.eachRow("select * from item") { item ->
//    println item.ITEM_ID + ". " + item.Title + " - " + item.Artist
//}
