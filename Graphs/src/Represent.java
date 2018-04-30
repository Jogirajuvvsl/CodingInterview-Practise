import java.util.LinkedList;

public class Represent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Graph graph=new Graph(5);
	graph.addEdge(0, 1);
	graph.addEdge(0, 2);
	graph.addEdge(1, 2);
	graph.addEdge(2, 3);
	graph.addEdge(3, 2);
	graph.addEdge(4, 1);	
	graph.printGraph();
	}

}


class Graph
{
	
	int vertexCount=0;
	LinkedList<Integer> edgeList[];
	
	public Graph(int v)
	{   vertexCount=v;
		edgeList=new LinkedList[v];
		
		for(int i=0;i<v;i++)
			edgeList[i]=new LinkedList<Integer>();
	}
	
	public void addEdge(int a,int b)
	{
		
		edgeList[a].addFirst(b);
		
		edgeList[b].addFirst(a);
	}
	
	public void printGraph()
	{
		for(int i=0;i<edgeList.length;i++)
		{
			LinkedList temp=edgeList[i];
			int size=temp.size();
			for(int j=0;j<size;j++)
				System.out.println(i+" "+temp.get(j));
			
		}
		
	}
	
}
