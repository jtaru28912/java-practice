package Account;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.PrinterException;
import java.io.*;

public class Notepad extends JFrame implements ActionListener {
	private static final String JOperationPane = null;
	JMenuBar mb1;
	JMenu mFile, mEdit, mTools, mHelp;
	JMenuItem mNew, mOpen, mSave, mPrint, mExit;
	JMenuItem mCut, mCopy, mPaste, mSelectAll;
	JMenuItem mView, mCompile, mRun;
	JMenuItem mAbout;
	JEditorPane jed;// class for edit panel insertion
	JFileChooser jfc;// class for open and save file chooser dilog box
	String fileName;
	

	public Notepad() {

		this.setVisible(true);
		this.setSize(400, 400);
		;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mb1 = new JMenuBar();
		mFile = new JMenu("file");

		mEdit = new JMenu("edit");
		mTools = new JMenu("tools");
		mHelp = new JMenu("help");

		mNew = new JMenuItem("New");
		mOpen = new JMenuItem("Open");
		mSave = new JMenuItem("Save");
		mPrint = new JMenuItem("Print");
		mExit = new JMenuItem("Exit");

		mCut = new JMenuItem("cut");
		mCopy = new JMenuItem("copy");
		mPaste = new JMenuItem("paste");
		mSelectAll = new JMenuItem("Selectall");

		mView = new JMenuItem("view");
		mCompile = new JMenuItem("compile");
		mRun = new JMenuItem("run");

		mAbout = new JMenuItem("About");
		JSeparator js1 = new JSeparator();
		JSeparator js2 = new JSeparator();

		mFile.add(mNew);
		mFile.add(mOpen);
		mFile.add(mSave);
		mFile.add(mPrint);
		mFile.add(js1);
		mFile.add(mExit);
		mEdit.add(mCut);
		mEdit.add(mCopy);
		mEdit.add(mPaste);
		mEdit.add(js2);
		mEdit.add(mSelectAll);
		mTools.add(mView);
		mTools.add(mCompile);
		mTools.add(mRun);
		mHelp.add(mAbout);
		mb1.add(mFile);
		mb1.add(mEdit);
		mb1.add(mTools);
		mb1.add(mHelp);
		this.setJMenuBar(mb1);
		jfc = new JFileChooser();
		jed = new JEditorPane();
		JScrollPane js = new JScrollPane(jed);
		getContentPane().add(js);

		mNew.addActionListener(this);
		mOpen.addActionListener(this);
		mSave.addActionListener(this);
		mPrint.addActionListener(this);
		mExit.addActionListener(this);
		mCut.addActionListener(this);
		mCopy.addActionListener(this);
		mPaste.addActionListener(this);
		mSelectAll.addActionListener(this);
		mView.addActionListener(this);
		mCompile.addActionListener(this);
		mRun.addActionListener(this);
		mAbout.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mNew) {
			jed.setText(" ");
			String fileName = JOptionPane.showInputDialog(null, "Enter file name");
			this.setTitle(fileName);
		}
		if (e.getSource() == mOpen) {
			jfc.showOpenDialog(null);
			try {
				File f= jfc.getSelectedFile();//to access file from system files data is read and aomes to the stream
				FileInputStream fin=new FileInputStream(f);
				byte data[]=new byte[fin.available()];
				fin.read(data);
				jed.setText(new String(data));
				fileName=f.getAbsolutePath();
				setTitle(fileName);
				
			}catch(Exception ex) {
				
			}
		}
		if (e.getSource() == mSave) {
			jfc.showSaveDialog(this);
			try {
				File f=jfc.getSelectedFile();
				FileOutputStream fout=new FileOutputStream(f);
				byte data[]=jed.getText().getBytes();//to convert from string to bytes and from bytes to byte array
				fout.write(data);
				fout.flush();
				fout.close();
				fileName=f.getAbsolutePath();
				setTitle(fileName);
				
			}catch(Exception ex) {
				
			}
		}
		if (e.getSource() == mPrint) {
			try {
				jed.print();
			} catch (PrinterException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == mExit) {
			JOptionPane.showMessageDialog(this, "byeeeee");
			JOptionPane.showMessageDialog(this, "byeeeee", "exit", JOptionPane.ERROR_MESSAGE);
			int res = JOptionPane.showConfirmDialog(null, "are u sure", "Confirm exit?", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (res == JOptionPane.YES_OPTION) {
			}
		}
		if (e.getSource() == mCut) {
			jed.cut();
		}
		if (e.getSource() == mCopy) {
			jed.copy();
		}
		if (e.getSource() == mPaste) {
			jed.paste();
		}
		if (e.getSource() == mSelectAll) {
			jed.selectAll();
		}
		if (e.getSource() == mView) {
			try {
				if(fileName.length()>0) {
					FileOutputStream fout=new FileOutputStream(fileName);
					byte data[]=jed.getText().getBytes();
					fout.write(data);
					fout.flush();
					fout.close();
				}
				Runtime rt=Runtime.getRuntime();//runtime command prompt of the running program
			rt.exec("cmd/c "+fileName);//open commend prompt for a sec with its output		
			}
catch(Exception ex) {
	
	
}
		}
		if (e.getSource() == mCompile) {
			try {
				if(fileName.endsWith(".java")) {
					FileOutputStream fout= new FileOutputStream(fileName);
					byte data[]=jed.getText().getBytes();
					fout.write(data);
					fout.flush();
					fout.close();
					Runtime rt=Runtime.getRuntime();
					Process p=rt.exec("cmd/c javac\""+fileName+"\"");
					BufferedReader br=new BufferedReader(new InputStreamReader(p.getErrorStream()));
					String error="";String e1="";
					while((e1=br.readLine())!=null)//reading lines ,errere, storing errors,comp with null
					{
						error=error+e1+"\n";
					}
					if(error =="") {
						JOptionPane.showMessageDialog(null,"Success");
					}
					else {
						JOptionPane.showMessageDialog(null,"error");

					}
					
				}
			}catch(Exception ex) {
				
			}

		}
		if (e.getSource() == mRun) {

		}
		if (e.getSource() == mAbout) {
			JOptionPane.showMessageDialog(null, "Project Deveoped by     TARU JAIN  ");
		}

	}

	public static void main(String args[]) {
		new Notepad();
	}

}
