package CampusNavigation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    private List<Node> Nodes = new ArrayList<Node>();

    // 初始化数据
    {
        Nodes.add(new Node("体检中心", "0", 115.568463, 38.88999, "体检中心"));
        Nodes.add(new Node("操场", "1", 115.572838, 38.891099, "操场"));
        Nodes.add(new Node("校门北口", "2", 115.575169, 38.889526, "校门北口"));
        Nodes.add(new Node("银杏景观", "3", 115.577738, 38.889031, "银杏景观"));
        Nodes.add(new Node("邯郸音乐厅", "4", 115.56897, 38.889411, "邯郸音乐厅"));
        Nodes.add(new Node("图书馆", "5", 115.572595, 38.887894, "图书馆"));
        Nodes.add(new Node("餐厅", "6", 115.576009, 38.888122, "餐厅"));
        Nodes.add(new Node("信息学部", "7", 115.571207, 38.887059, "信息学部"));
        Nodes.add(new Node("花园景观", "8", 115.572303, 38.886111, "花园景观"));
        Nodes.add(new Node("校门东口", "9", 115.574818, 38.886585, "校门东口"));
        Nodes.add(new Node("网计学院", "10", 115.569518, 38.885668, "网计学院"));
        Nodes.add(new Node("校门南口", "11", 115.571894, 38.883077, "校门南口"));
    }

//    String[] Name = {"体检中心", "操场", "校门北口", "银杏景观", "邯郸音乐厅", "图书馆", "餐厅", "信息学部", "花园景观", "校门东口", "网计学院", "校门南口"};
//    String[] Number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
//    String[] About = {"没啥0", "没啥1", "没啥2", "没啥3", "没啥4", "没啥5", "没啥6", "没啥7", "没啥8", "没啥9", "没啥0", "没啥"};
//    double[] Longitude = {115.568463, 115.572838, 115.575169, 115.577738, 115.56897, 115.572595, 115.576009, 115.571207, 115.572303, 115.574818, 115.569518, 115.571894};
//    double[] Latitude = {38.88999, 38.891099, 38.889526, 38.889031, 38.889411, 38.887894, 38.888122, 38.887059, 38.886111, 38.886585, 38.885668, 38.883077};


    public List<Node> getNodes() {
        return Nodes;
    }

    public static void main(String[] args) {
        System.out.println(new Data().getNodes().size());
    }
}