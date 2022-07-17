package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.R.layout
import com.example.orgs.model.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val produtos = listOf(
            Produto(
                nome = "Apple",
                descricao = "fruits",
                valor = BigDecimal("0.99")
            ),
            Produto(
                nome = "Banana",
                descricao = "fruits",
                valor = BigDecimal("1.99")
            ),
            Produto(
                nome = "Avocado",
                descricao = "fruits",
                valor = BigDecimal("2.99")
            ),
            Produto(
                nome = "Aloe",
                descricao = "plant",
                valor = BigDecimal("5.99")
            ),
            Produto(
                nome = "ginger",
                descricao = "plant",
                valor = BigDecimal("9.99")
            )
        )

        recyclerView.adapter = ListaProdutosAdapter(produtos = produtos)

        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}