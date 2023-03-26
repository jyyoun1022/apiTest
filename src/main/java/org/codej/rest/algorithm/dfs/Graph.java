package org.codej.rest.algorithm.dfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Graph {
    private int V; //노드의 개수
    private LinkedList<Integer> adj[]; // 인접 리스트

    public Graph(int v) {
        V = v;
        this.adj = new LinkedList[v];
        System.out.println("ADJ SIZE ::: " + adj.length);
        for (int i = 0; i < v; ++i) {
            this.adj[i] = new LinkedList<>();
        }
    }

    /**
     * 노드를 연결 v -> w
     */
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    /**
     * DFS에 의해 사용되는 함수
     */
    void DFSUtil(int v, boolean visited[]) {
        //현재 노드를 방문한 것으로 표시하고 값을 출력
        visited[v] = true;
        System.out.print(v + " ");

        //방문한 노드와 인접한 모든 노드를 가져온다.
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            // 방문하지 않은 노드면 해당 노드를 시작 노드로 다시 DFSUtil 호출
            if (!visited[n]) {
                DFSUtil(n, visited); //순환 호출
            }
        }
    }

    /**
     * 주어진 노드를 시작 노드로 DFS 탐색
     */
    void DFS(int v) {
        // 노드의 방문 여부 판단 (초기값 :false)
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }

    /**
     * DFS 탐색
     */
    void DFS() {
        // 노드의 방문 여부 판단 (초깃값: false)
        boolean visited[] = new boolean[V];

        // 비연결형 그래프의 경우, 모든 정점을 하나씩 방문
        for (int i = 0; i < V; ++i) {
            if (visited[i] == false)
                DFSUtil(i, visited);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,3);

        graph.DFS(2); // 주어진 노드를 시작 노드로 DFS 탐색
        graph.DFS(); // 비연결형 그래프의 경우
    }
}
