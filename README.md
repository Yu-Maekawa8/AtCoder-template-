# Java Competitive Programming Snippets for VSCode

このリポジトリは、競技プログラミングで使える **Java の VSCode 用スニペット集**です。  
よく使う入力・出力・アルゴリズム・データ構造などのコードを、ショートカットで素早く呼び出せます。

---

## 📦 基本テンプレート

| Prefix | 内容 |
|--------|------|
| `jtem` | `Scanner`入力付きのベーステンプレート（Mainクラス） |

---

## 🔽 入力系

### 単体入力

| Prefix | 内容 |
|--------|------|
| `in`   | `int` 1つ |
| `in2`  | `int` 2つ |
| `lo`   | `long` 1つ |
| `st`   | `String` 1つ |
| `ch`   | `char` 1つ |

### 配列・多次元配列

| Prefix  | 内容 |
|---------|------|
| `arin`  | `int[]` の入力 |
| `arin2` | `int[][]` の入力（高さ×幅） |
| `ars`   | `String[]` の入力 |
| `ars2`  | `String[][]` の入力 |

---

## 📤 出力系

| Prefix | 内容 |
|--------|------|
| `out`      | 改行なし出力 |
| `outln`    | 改行あり出力 |
| `outarr`   | 配列を1行で出力 |
| `outlist`  | Listを1行出力 |
| `sbout`    | StringBuilderで高速出力 |
| `yesno`    | 条件により "Yes" or "No" 出力 |

---

## 🔁 ループ・制御

| Prefix | 内容 |
|--------|------|
| `fori` / `forj` / `fork` | 一般的なfor文 |
| `yn` | Yes/No判定出力 |

---

## 📚 データ構造

| Prefix | 内容 |
|--------|------|
| `que`    | `Queue<Integer>` の初期化 |
| `stac`   | `Stack<Integer>` の初期化 |
| `deq`    | `Deque<Integer>`（両端キュー） |
| `pri`    | 優先度付きキュー（昇順） |
| `prirev` | 優先度付きキュー（降順） |
| `map`    | `Map<Integer, Integer>` |
| `set`    | `Set<Integer>` |

---

## 🧮 数学系

| Prefix | 内容 |
|--------|------|
| `gcd`  | 最大公約数関数 |
| `lcm`  | 最小公倍数関数 |
| `mod`  | `mod = 1_000_000_007` |
| `prime` | 素数判定 |
| `pow`  | 累乗（mod付き） |

---

## 🧭 アルゴリズムテンプレート

| Prefix | 内容 |
|--------|------|
| `bfs`      | 幅優先探索 |
| `dfs`      | 深さ優先探索 |
| `revbfs`   | 逆順BFS |
| `pairclass`| Comparableな Pair クラス |
| `sortpairs`| Pairのリストをソート |

---

## 📐 座標移動

| Prefix | 内容 |
|--------|------|
| `dxdy`   | 上下左右の移動 |
| `dxdy8`  | 8方向の移動 |

---

## 🔁 配列⇔List変換

| Prefix | 内容 |
|--------|------|
| `arr2list`     | `int[]` → `List<Integer>` |
| `list2arr`     | `List<Integer>` → `int[]` |
| `list2arr2d`   | `List<List<Integer>>` → `int[][]` |

---

## ✅ 使い方

1. `snippets/java.json` にこのテンプレートを貼り付けてください。
2. VSCode で `.java` ファイルを開き、`jtem`, `arin`, `outarr` などの prefix を入力して Tab で展開！

---

## 📌 例：標準的な入力と出力

```java
int n = sc.nextInt();
int[] ar = new int[n];
for (int i = 0; i < n; i++) {
    ar[i] = sc.nextInt();
}
for (int x : ar) {
    System.out.print(x + " ");
}
