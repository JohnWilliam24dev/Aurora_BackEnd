package com.duckers.aurora.Service

import org.springframework.stereotype.Service
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

@Service
class ImageService {

    private val pastaImagens: Path = Paths.get("imagens/server")

    init {

        if (!Files.exists(pastaImagens)) {
            Files.createDirectories(pastaImagens)
        }
    }


    fun salvarImagemBytes(id: Long, bytes: ByteArray): String {
        return salvarImagem(id, bytes)
    }


    fun atualizarImagemBytes(id: Long, bytes: ByteArray): String {
        deletarImagem(id)
        return salvarImagem(id, bytes)
    }


    fun carregarImagem(id: Long): ByteArray {
        val caminhoArquivo = pastaImagens.resolve("$id.jpg")
        if (!Files.exists(caminhoArquivo)) {
            throw RuntimeException("Imagem não encontrada para o produto $id")
        }
        return Files.readAllBytes(caminhoArquivo)
    }


    fun deletarImagem(id: Long) {
        val caminhoArquivo = pastaImagens.resolve("$id.jpg")
        if (Files.exists(caminhoArquivo)) {
            Files.delete(caminhoArquivo)
        } else {
            throw RuntimeException("Imagem não encontrada para deletar para o produto $id")
        }
    }


    private fun salvarImagem(id: Long, bytes: ByteArray): String {
        try {
            val nomeArquivo = "$id.jpg"
            val caminhoArquivo = pastaImagens.resolve(nomeArquivo)
            Files.write(caminhoArquivo, bytes)
            return caminhoArquivo.toString()
        } catch (e: IOException) {
            throw RuntimeException("Erro ao salvar imagem: ${e.message}")
        }
    }
}
