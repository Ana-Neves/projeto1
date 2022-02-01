import java.util.*

fun main() {

}

    class Vendedor {
    var nome:String?= null
    var idade:Byte?= null
    var gmail:String?= null
    var dataNascimento:Date?= null
    var cpf:String?= null
  }


    class Cliente {
    var nome:String?= null
    var email:String?= null
    var cpf:String?= null
    var dataNascimento?= null
    }



    class Fornecedor {
        var nome: String? = null
        var idade: Byte? = null
        var cpf: String? = null
        var produto: String? = null
    }



    class Produto {
        var nome:String?= null
        var vencimento:Date?= null
        var dataDeLancamento:Date?= null
        var preco:Int?= null
    }


    class Venda {
        var estoque: String? = null
        var tempoDaEntrega: Date? = null
        var produto: Produto? = null
    }


      class Transportadora {
          var nome: String? = null
          var dataDeEntrega: Date? = null
          var telefoneComercial: String? = null
          var tempoEntrega: Date? = null
      }
        

