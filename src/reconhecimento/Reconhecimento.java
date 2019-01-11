/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reconhecimento;

import weka.classifiers.bayes.NaiveBayes;
import weka.core.DenseInstance;
import weka.core.Instance;
//import weka.classifiers.lazy.IBk;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author Aisha Lubadika
 */
public class Reconhecimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
      DataSource ds= new DataSource("src/reconhecimento/emprestimo.arff"); //crega a base de dados
      Instances ins= ds.getDataSet();
        //System.out.println(ins.toString());//yesye para ver se a BD foi carregada
        
        ins.setClassIndex(5); //indico ao weka qaul é o indice do atributo de classificaçao , neste caso será o 5 porque quer-se saber se pagou ou não o emprestimo
        NaiveBayes nb=  new NaiveBayes();
        //IBk n = new IBk();
        nb.buildClassifier(ins);
        
        Instance novo= new DenseInstance(6);
        novo.setDataset(ins);
        novo.setValue(0, 1);
        novo.setValue(1, "Autonomo");
        novo.setValue(2, 8);
        novo.setValue(3, "Alugada");
        novo.setValue(4, ">=90000");
        
        double probabilidade []= nb.distributionForInstance(novo);
        
        System.out.println("Sim:  "+ probabilidade[0]);
        System.out.println("Não:  "+ probabilidade[1]);
        
        
    }
    
}
