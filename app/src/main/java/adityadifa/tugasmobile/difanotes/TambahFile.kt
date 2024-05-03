package adityadifa.tugasmobile.difanotes

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TambahFile.newInstance] factory method to
 * create an instance of this fragment.
 */
class TambahFile : DialogFragment() {
//    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_tambah_file, container, false)
//    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Menggunakan layout XML untuk tampilan dialog
        val inflater = requireActivity().layoutInflater
        val view = inflater.inflate(R.layout.fragment_tambah_file, null)

        // Mengambil referensi ke elemen-elemen tampilan dalam layout
        val inputNama = view.findViewById<EditText>(R.id.inputNama)
        val btnBatal = view.findViewById<Button>(R.id.btnBatal)
        val btnBuat = view.findViewById<Button>(R.id.btnBuat)

        btnBuat.setOnClickListener(){

        }
        btnBatal.setOnClickListener(){
            dismiss()
        }


        // Membuat AlertDialog menggunakan builder dan mengatur tampilan dari layout XML
        val builder = AlertDialog.Builder(requireActivity())
        builder.setView(view)

        // Membuat dialog dari builder
        return builder.create()
    }
}