package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public class Path {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static java.util.regex.Pattern component;

    static {
            java.lang.String r0 = "(....|\\.\\.)(\\[(.*)\\])?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.googlecode.mp4parser.util.Path.component = r0
            return
    }

    private Path() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String createPath(com.coremedia.iso.boxes.Box r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = createPath(r1, r0)
            return r1
    }

    private static java.lang.String createPath(com.coremedia.iso.boxes.Box r7, java.lang.String r8) {
            com.coremedia.iso.boxes.Container r0 = r7.getParent()
            java.util.List r1 = r0.getBoxes()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        Le:
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto L15
            goto L2b
        L15:
            java.lang.Object r4 = r1.next()
            com.coremedia.iso.boxes.Box r4 = (com.coremedia.iso.boxes.Box) r4
            java.lang.String r5 = r4.getType()
            java.lang.String r6 = r7.getType()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Le
            if (r4 != r7) goto L5c
        L2b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r7 = r7.getType()
            r4[r2] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r2 = 1
            r4[r2] = r7
            java.lang.String r7 = "/%s[%d]"
            java.lang.String r7 = java.lang.String.format(r7, r4)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r1.<init>(r7)
            r1.append(r8)
            java.lang.String r7 = r1.toString()
            boolean r8 = r0 instanceof com.coremedia.iso.boxes.Box
            if (r8 == 0) goto L5b
            com.coremedia.iso.boxes.Box r0 = (com.coremedia.iso.boxes.Box) r0
            java.lang.String r7 = createPath(r0, r7)
        L5b:
            return r7
        L5c:
            int r3 = r3 + 1
            goto Le
    }

    public static <T extends com.coremedia.iso.boxes.Box> T getPath(com.coremedia.iso.boxes.Box r1, java.lang.String r2) {
            r0 = 1
            java.util.List r1 = getPaths(r1, r2, r0)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Ld
            r1 = 0
            goto L14
        Ld:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.coremedia.iso.boxes.Box r1 = (com.coremedia.iso.boxes.Box) r1
        L14:
            return r1
    }

    public static <T extends com.coremedia.iso.boxes.Box> T getPath(com.coremedia.iso.boxes.Container r1, java.lang.String r2) {
            r0 = 1
            java.util.List r1 = getPaths(r1, r2, r0)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Ld
            r1 = 0
            goto L14
        Ld:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.coremedia.iso.boxes.Box r1 = (com.coremedia.iso.boxes.Box) r1
        L14:
            return r1
    }

    public static <T extends com.coremedia.iso.boxes.Box> T getPath(com.googlecode.mp4parser.AbstractContainerBox r1, java.lang.String r2) {
            r0 = 1
            java.util.List r1 = getPaths(r1, r2, r0)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Ld
            r1 = 0
            goto L14
        Ld:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.coremedia.iso.boxes.Box r1 = (com.coremedia.iso.boxes.Box) r1
        L14:
            return r1
    }

    public static <T extends com.coremedia.iso.boxes.Box> java.util.List<T> getPaths(com.coremedia.iso.boxes.Box r1, java.lang.String r2) {
            r0 = 0
            java.util.List r1 = getPaths(r1, r2, r0)
            return r1
    }

    private static <T extends com.coremedia.iso.boxes.Box> java.util.List<T> getPaths(com.coremedia.iso.boxes.Box r0, java.lang.String r1, boolean r2) {
            java.util.List r0 = getPaths(r0, r1, r2)
            return r0
    }

    public static <T extends com.coremedia.iso.boxes.Box> java.util.List<T> getPaths(com.coremedia.iso.boxes.Container r1, java.lang.String r2) {
            r0 = 0
            java.util.List r1 = getPaths(r1, r2, r0)
            return r1
    }

    private static <T extends com.coremedia.iso.boxes.Box> java.util.List<T> getPaths(com.coremedia.iso.boxes.Container r0, java.lang.String r1, boolean r2) {
            java.util.List r0 = getPaths(r0, r1, r2)
            return r0
    }

    private static <T extends com.coremedia.iso.boxes.Box> java.util.List<T> getPaths(com.googlecode.mp4parser.AbstractContainerBox r0, java.lang.String r1, boolean r2) {
            java.util.List r0 = getPaths(r0, r1, r2)
            return r0
    }

    private static <T extends com.coremedia.iso.boxes.Box> java.util.List<T> getPaths(java.lang.Object r7, java.lang.String r8, boolean r9) {
            java.lang.String r0 = "/"
            boolean r1 = r8.startsWith(r0)
            r2 = 1
            if (r1 == 0) goto L1a
            java.lang.String r1 = r8.substring(r2)
        Ld:
            boolean r8 = r7 instanceof com.coremedia.iso.boxes.Box
            if (r8 != 0) goto L13
            r8 = r1
            goto L1a
        L13:
            com.coremedia.iso.boxes.Box r7 = (com.coremedia.iso.boxes.Box) r7
            com.coremedia.iso.boxes.Container r7 = r7.getParent()
            goto Ld
        L1a:
            int r1 = r8.length()
            if (r1 != 0) goto L33
            boolean r8 = r7 instanceof com.coremedia.iso.boxes.Box
            if (r8 == 0) goto L2b
            com.coremedia.iso.boxes.Box r7 = (com.coremedia.iso.boxes.Box) r7
            java.util.List r7 = java.util.Collections.singletonList(r7)
            return r7
        L2b:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r8 = "Result of path expression seems to be the root container. This is not allowed!"
            r7.<init>(r8)
            throw r7
        L33:
            boolean r0 = r8.contains(r0)
            r1 = 0
            if (r0 == 0) goto L4e
            r0 = 47
            int r3 = r8.indexOf(r0)
            int r3 = r3 + r2
            java.lang.String r3 = r8.substring(r3)
            int r0 = r8.indexOf(r0)
            java.lang.String r8 = r8.substring(r1, r0)
            goto L50
        L4e:
            java.lang.String r3 = ""
        L50:
            java.util.regex.Pattern r0 = com.googlecode.mp4parser.util.Path.component
            java.util.regex.Matcher r0 = r0.matcher(r8)
            boolean r4 = r0.matches()
            if (r4 == 0) goto Ld6
            java.lang.String r8 = r0.group(r2)
            java.lang.String r2 = ".."
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L7c
            boolean r8 = r7 instanceof com.coremedia.iso.boxes.Box
            if (r8 == 0) goto L77
            com.coremedia.iso.boxes.Box r7 = (com.coremedia.iso.boxes.Box) r7
            com.coremedia.iso.boxes.Container r7 = r7.getParent()
            java.util.List r7 = getPaths(r7, r3, r9)
            return r7
        L77:
            java.util.List r7 = java.util.Collections.emptyList()
            return r7
        L7c:
            boolean r2 = r7 instanceof com.coremedia.iso.boxes.Container
            if (r2 == 0) goto Ld1
            r2 = 2
            java.lang.String r2 = r0.group(r2)
            r4 = -1
            if (r2 == 0) goto L92
            r2 = 3
            java.lang.String r0 = r0.group(r2)
            int r0 = java.lang.Integer.parseInt(r0)
            goto L93
        L92:
            r0 = -1
        L93:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            com.coremedia.iso.boxes.Container r7 = (com.coremedia.iso.boxes.Container) r7
            java.util.List r7 = r7.getBoxes()
            java.util.Iterator r7 = r7.iterator()
        La2:
            boolean r5 = r7.hasNext()
            if (r5 != 0) goto La9
            return r2
        La9:
            java.lang.Object r5 = r7.next()
            com.coremedia.iso.boxes.Box r5 = (com.coremedia.iso.boxes.Box) r5
            java.lang.String r6 = r5.getType()
            boolean r6 = r6.matches(r8)
            if (r6 == 0) goto Lc6
            if (r0 == r4) goto Lbd
            if (r0 != r1) goto Lc4
        Lbd:
            java.util.List r5 = getPaths(r5, r3, r9)
            r2.addAll(r5)
        Lc4:
            int r1 = r1 + 1
        Lc6:
            if (r9 != 0) goto Lca
            if (r0 < 0) goto La2
        Lca:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto La2
            return r2
        Ld1:
            java.util.List r7 = java.util.Collections.emptyList()
            return r7
        Ld6:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r9.<init>(r8)
            java.lang.String r8 = " is invalid path."
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
    }

    public static boolean isContained(com.coremedia.iso.boxes.Box r0, java.lang.String r1) {
            java.util.List r1 = getPaths(r0, r1)
            boolean r0 = r1.contains(r0)
            return r0
    }
}
