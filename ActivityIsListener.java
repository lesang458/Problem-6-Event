public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etA,etB;
    private TextView tvKetQua;
    private Button btnTong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etA= findViewById(R.id.etA);
        etB= findViewById(R.id.etB);
        tvKetQua = findViewById(R.id.tvKetQua);
        btnTong = findViewById(R.id.btnTong);
        btnTong.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int a= Integer.parseInt(etA.getText().toString().trim());
        int b= Integer.parseInt(etB.getText().toString().trim());
        int Tong = a+b;
        tvKetQua.setText(Tong+"");
    }
}
