package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class NodeBox extends org.jcodec.containers.mp4.boxes.Box {
    protected java.util.List<org.jcodec.containers.mp4.boxes.Box> boxes;
    protected org.jcodec.containers.mp4.boxes.BoxFactory factory;

    public NodeBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r0.boxes = r1
            org.jcodec.containers.mp4.boxes.BoxFactory r1 = org.jcodec.containers.mp4.boxes.BoxFactory.getDefault()
            r0.factory = r1
            return
    }

    public static org.jcodec.containers.mp4.boxes.Box newBox(org.jcodec.containers.mp4.boxes.Header r4, org.jcodec.containers.mp4.boxes.BoxFactory r5) {
            java.lang.String r0 = r4.getFourcc()
            java.lang.Class r5 = r5.toClass(r0)
            if (r5 != 0) goto L10
            org.jcodec.containers.mp4.boxes.LeafBox r5 = new org.jcodec.containers.mp4.boxes.LeafBox
            r5.<init>(r4)
            return r5
        L10:
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L27 java.lang.NoSuchMethodException -> L29
            java.lang.Class<org.jcodec.containers.mp4.boxes.Header> r2 = org.jcodec.containers.mp4.boxes.Header.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L27 java.lang.NoSuchMethodException -> L29
            java.lang.reflect.Constructor r1 = r5.getConstructor(r1)     // Catch: java.lang.Exception -> L27 java.lang.NoSuchMethodException -> L29
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L27 java.lang.NoSuchMethodException -> L29
            r0[r3] = r4     // Catch: java.lang.Exception -> L27 java.lang.NoSuchMethodException -> L29
            java.lang.Object r4 = r1.newInstance(r0)     // Catch: java.lang.Exception -> L27 java.lang.NoSuchMethodException -> L29
            org.jcodec.containers.mp4.boxes.Box r4 = (org.jcodec.containers.mp4.boxes.Box) r4     // Catch: java.lang.Exception -> L27 java.lang.NoSuchMethodException -> L29
            return r4
        L27:
            r4 = move-exception
            goto L30
        L29:
            java.lang.Object r4 = r5.newInstance()     // Catch: java.lang.Exception -> L27
            org.jcodec.containers.mp4.boxes.Box r4 = (org.jcodec.containers.mp4.boxes.Box) r4     // Catch: java.lang.Exception -> L27
            return r4
        L30:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
    }

    public static org.jcodec.containers.mp4.boxes.Box parseBox(java.nio.ByteBuffer r4, org.jcodec.containers.mp4.boxes.Header r5, org.jcodec.containers.mp4.boxes.BoxFactory r6) {
            org.jcodec.containers.mp4.boxes.Box r6 = newBox(r5, r6)
            long r0 = r5.getBodySize()
            r2 = 134217728(0x8000000, double:6.63123685E-316)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L13
            r6.parse(r4)
            return r6
        L13:
            org.jcodec.containers.mp4.boxes.LeafBox r4 = new org.jcodec.containers.mp4.boxes.LeafBox
            r5 = 8
            java.lang.String r0 = "free"
            org.jcodec.containers.mp4.boxes.Header r5 = org.jcodec.containers.mp4.boxes.Header.createHeader(r0, r5)
            r4.<init>(r5)
            return r4
    }

    public static org.jcodec.containers.mp4.boxes.Box parseChildBox(java.nio.ByteBuffer r7, org.jcodec.containers.mp4.boxes.BoxFactory r8) {
            java.nio.ByteBuffer r0 = r7.duplicate()
        L4:
            int r1 = r7.remaining()
            r2 = 4
            if (r1 < r2) goto L15
            int r1 = r0.getInt()
            if (r1 != 0) goto L15
            r7.getInt()
            goto L4
        L15:
            int r0 = r7.remaining()
            r1 = 0
            if (r0 >= r2) goto L1d
            return r1
        L1d:
            org.jcodec.containers.mp4.boxes.Header r0 = org.jcodec.containers.mp4.boxes.Header.read(r7)
            if (r0 == 0) goto L3e
            int r2 = r7.remaining()
            long r2 = (long) r2
            long r4 = r0.getBodySize()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L3e
            long r1 = r0.getBodySize()
            int r2 = (int) r1
            java.nio.ByteBuffer r7 = org.jcodec.common.io.NIOUtils.read(r7, r2)
            org.jcodec.containers.mp4.boxes.Box r7 = parseBox(r7, r0, r8)
            return r7
        L3e:
            return r1
    }

    public void add(org.jcodec.containers.mp4.boxes.Box r2) {
            r1 = this;
            java.util.List<org.jcodec.containers.mp4.boxes.Box> r0 = r1.boxes
            r0.add(r2)
            return
    }

    public void addFirst(org.jcodec.containers.mp4.boxes.MovieHeaderBox r3) {
            r2 = this;
            java.util.List<org.jcodec.containers.mp4.boxes.Box> r0 = r2.boxes
            r1 = 0
            r0.add(r1, r3)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r3) {
            r2 = this;
            java.util.List<org.jcodec.containers.mp4.boxes.Box> r0 = r2.boxes
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            org.jcodec.containers.mp4.boxes.Box r1 = (org.jcodec.containers.mp4.boxes.Box) r1
            r1.write(r3)
            goto L6
        L16:
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    protected void dump(java.lang.StringBuilder r4) {
            r3 = this;
            org.jcodec.containers.mp4.boxes.Header r0 = r3.header
            java.lang.String r0 = r0.getFourcc()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "{\"tag\":\""
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "\","
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.append(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r0.<init>(r1)
            java.lang.Class r2 = r3.getClass()
            r3.collectModel(r2, r0)
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            org.jcodec.common.tools.ToJSON.fieldsToJSON(r3, r4, r0)
            java.lang.String r0 = "\"boxes\": ["
            r4.append(r0)
            r3.dumpBoxes(r4)
            java.lang.String r0 = "]"
            r4.append(r0)
            java.lang.String r0 = "}"
            r4.append(r0)
            return
    }

    protected void dumpBoxes(java.lang.StringBuilder r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<org.jcodec.containers.mp4.boxes.Box> r1 = r2.boxes
            int r1 = r1.size()
            if (r0 >= r1) goto L26
            java.util.List<org.jcodec.containers.mp4.boxes.Box> r1 = r2.boxes
            java.lang.Object r1 = r1.get(r0)
            org.jcodec.containers.mp4.boxes.Box r1 = (org.jcodec.containers.mp4.boxes.Box) r1
            r1.dump(r3)
            java.util.List<org.jcodec.containers.mp4.boxes.Box> r1 = r2.boxes
            int r1 = r1.size()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L23
            java.lang.String r1 = ","
            r3.append(r1)
        L23:
            int r0 = r0 + 1
            goto L1
        L26:
            return
    }

    public java.util.List<org.jcodec.containers.mp4.boxes.Box> getBoxes() {
            r1 = this;
            java.util.List<org.jcodec.containers.mp4.boxes.Box> r0 = r1.boxes
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
        L0:
            int r0 = r3.remaining()
            r1 = 8
            if (r0 < r1) goto L16
            org.jcodec.containers.mp4.boxes.BoxFactory r0 = r2.factory
            org.jcodec.containers.mp4.boxes.Box r0 = parseChildBox(r3, r0)
            if (r0 == 0) goto L0
            java.util.List<org.jcodec.containers.mp4.boxes.Box> r1 = r2.boxes
            r1.add(r0)
            goto L0
        L16:
            return
    }
}
