Public Class Ejercicio_003
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click


        Dim Numeros(8) As Integer, I As Integer, J As Integer, suma As Integer
        Dim Aux As Integer
        Dim strMsg As String
        Dim promedio As Integer

        Numeros(0) = Val(TextBox1.Text)
        Numeros(1) = Val(TextBox2.Text)
        Numeros(2) = Val(TextBox3.Text)
        Numeros(3) = Val(TextBox4.Text)
        Numeros(4) = Val(TextBox5.Text)
        Numeros(5) = Val(TextBox6.Text)
        Numeros(6) = Val(TextBox7.Text)
        Numeros(7) = Val(TextBox8.Text)

        For I = 0 To 7  'FOR ---> PARA "I" =....
            For J = 0 To 7
                If Numeros(I) < Numeros(J) Then
                    Aux = Numeros(J)
                    Numeros(J) = Numeros(I)
                    Numeros(I) = Aux
                End If
            Next J
        Next I

        For I = 0 To 7
            strMsg = strMsg & Numeros(I) & " - "
            'operando el promedio de los 7 ultimos
            suma = (Numeros(1) + Numeros(2) + Numeros(3) + Numeros(4) + Numeros(5) + Numeros(6) + Numeros(7))
        Next I
        promedio = suma / 7

        TextBox9.Text = strMsg
        TextBox10.Text = suma
        TextBox11.Text = promedio

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click

        TextBox1.Text = ""
        TextBox2.Text = ""
        TextBox3.Text = ""
        TextBox4.Text = ""
        TextBox5.Text = ""
        TextBox6.Text = ""
        TextBox7.Text = ""
        TextBox8.Text = ""
        TextBox9.Text = ""
        TextBox10.Text = ""
        TextBox11.Text = ""
    End Sub
End Class