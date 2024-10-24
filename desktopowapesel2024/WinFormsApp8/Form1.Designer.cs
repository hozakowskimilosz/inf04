namespace WinFormsApp8
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            textBox1 = new TextBox();
            textBox2 = new TextBox();
            textBox3 = new TextBox();
            groupBox1 = new GroupBox();
            radioButton3 = new RadioButton();
            radioButton2 = new RadioButton();
            radioButton1 = new RadioButton();
            button1 = new Button();
            pictureBox1 = new PictureBox();
            pictureBox2 = new PictureBox();
            groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).BeginInit();
            ((System.ComponentModel.ISupportInitialize)pictureBox2).BeginInit();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(40, 37);
            label1.Name = "label1";
            label1.Size = new Size(44, 15);
            label1.TabIndex = 0;
            label1.Text = "Numer";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(40, 77);
            label2.Name = "label2";
            label2.Size = new Size(30, 15);
            label2.TabIndex = 1;
            label2.Text = "Imię";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(40, 116);
            label3.Name = "label3";
            label3.Size = new Size(57, 15);
            label3.TabIndex = 2;
            label3.Text = "Nazwisko";
            // 
            // textBox1
            // 
            textBox1.BackColor = Color.Azure;
            textBox1.Location = new Point(160, 34);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(180, 23);
            textBox1.TabIndex = 3;
            textBox1.Leave += textBox1_Leave;
            // 
            // textBox2
            // 
            textBox2.BackColor = Color.Azure;
            textBox2.Location = new Point(160, 77);
            textBox2.Name = "textBox2";
            textBox2.Size = new Size(180, 23);
            textBox2.TabIndex = 4;
            // 
            // textBox3
            // 
            textBox3.BackColor = Color.Azure;
            textBox3.Location = new Point(160, 116);
            textBox3.Name = "textBox3";
            textBox3.Size = new Size(180, 23);
            textBox3.TabIndex = 5;
            // 
            // groupBox1
            // 
            groupBox1.Controls.Add(radioButton3);
            groupBox1.Controls.Add(radioButton2);
            groupBox1.Controls.Add(radioButton1);
            groupBox1.Location = new Point(40, 216);
            groupBox1.Name = "groupBox1";
            groupBox1.Size = new Size(275, 149);
            groupBox1.TabIndex = 6;
            groupBox1.TabStop = false;
            groupBox1.Text = "Kolor oczu";
            // 
            // radioButton3
            // 
            radioButton3.AutoSize = true;
            radioButton3.Location = new Point(24, 115);
            radioButton3.Name = "radioButton3";
            radioButton3.Size = new Size(57, 19);
            radioButton3.TabIndex = 2;
            radioButton3.Text = "piwne";
            radioButton3.UseVisualStyleBackColor = true;
            // 
            // radioButton2
            // 
            radioButton2.AutoSize = true;
            radioButton2.Location = new Point(24, 77);
            radioButton2.Name = "radioButton2";
            radioButton2.Size = new Size(62, 19);
            radioButton2.TabIndex = 1;
            radioButton2.Text = "zielone";
            radioButton2.UseVisualStyleBackColor = true;
            // 
            // radioButton1
            // 
            radioButton1.AutoSize = true;
            radioButton1.Checked = true;
            radioButton1.Location = new Point(24, 36);
            radioButton1.Name = "radioButton1";
            radioButton1.Size = new Size(77, 19);
            radioButton1.TabIndex = 0;
            radioButton1.TabStop = true;
            radioButton1.Text = "niebieskie";
            radioButton1.UseVisualStyleBackColor = true;
            // 
            // button1
            // 
            button1.BackColor = Color.Azure;
            button1.Location = new Point(442, 304);
            button1.Name = "button1";
            button1.Size = new Size(279, 61);
            button1.TabIndex = 7;
            button1.Text = "OK";
            button1.UseVisualStyleBackColor = false;
            button1.Click += button1_Click;
            // 
            // pictureBox1
            // 
            pictureBox1.Image = (Image)resources.GetObject("pictureBox1.Image");
            pictureBox1.Location = new Point(386, 40);
            pictureBox1.Name = "pictureBox1";
            pictureBox1.Size = new Size(198, 225);
            pictureBox1.TabIndex = 8;
            pictureBox1.TabStop = false;
            // 
            // pictureBox2
            // 
            pictureBox2.Image = (Image)resources.GetObject("pictureBox2.Image");
            pictureBox2.Location = new Point(590, 40);
            pictureBox2.Name = "pictureBox2";
            pictureBox2.Size = new Size(198, 225);
            pictureBox2.TabIndex = 9;
            pictureBox2.TabStop = false;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            BackColor = Color.CadetBlue;
            ClientSize = new Size(800, 450);
            Controls.Add(pictureBox2);
            Controls.Add(pictureBox1);
            Controls.Add(button1);
            Controls.Add(groupBox1);
            Controls.Add(textBox3);
            Controls.Add(textBox2);
            Controls.Add(textBox1);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Wprowadzanie danych do paszportu. Wykonał ";
            groupBox1.ResumeLayout(false);
            groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).EndInit();
            ((System.ComponentModel.ISupportInitialize)pictureBox2).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private Label label3;
        private TextBox textBox1;
        private TextBox textBox2;
        private TextBox textBox3;
        private GroupBox groupBox1;
        private RadioButton radioButton3;
        private RadioButton radioButton2;
        private RadioButton radioButton1;
        private Button button1;
        private PictureBox pictureBox1;
        private PictureBox pictureBox2;
    }
}