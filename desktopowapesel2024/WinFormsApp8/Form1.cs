namespace WinFormsApp8
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_Leave(object sender, EventArgs e)
        {
            string number = textBox1.Text.ToString();

            string printPath = @"C:\\Users\\user\\Desktop\\" + number + "-odcisk.jpg";
            string personPath = @"C:\\Users\\user\\Desktop\\" + number + "-zdjecie.jpg";

            pictureBox1.ImageLocation = printPath;
            pictureBox2.ImageLocation = personPath;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string number = textBox1.Text.ToString();
            string name = textBox2.Text.ToString();
            string surname = textBox3.Text.ToString();
            string eyes = radioButton1.Checked ? "niebieskie" : radioButton2.Checked ? "zielone" : "piwne";

            if(number != "" && name != "" && surname != "")
            {
                MessageBox.Show(name + " " + surname + " " + eyes);
            }
            else
            {
                MessageBox.Show("Wprowadü dane");
            }
        }
    }
}