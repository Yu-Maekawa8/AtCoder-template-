
/*
*Pair  HashSet利用
*/

Set<Pair> visited = new HashSet<>();
visited.add(new Pair(3, 7));

if (visited.contains(new Pair(3, 7))) {
    System.out.println("訪問済み");
}
