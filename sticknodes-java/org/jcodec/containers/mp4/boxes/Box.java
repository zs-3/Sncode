package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public abstract class Box {
    protected org.jcodec.containers.mp4.boxes.Header header;

    public Box(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>()
            r0.header = r1
            return
    }

    public static <T extends org.jcodec.containers.mp4.boxes.Box> T asBox(java.lang.Class<T> r4, org.jcodec.containers.mp4.boxes.Box r5) {
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L34
            java.lang.Class<org.jcodec.containers.mp4.boxes.Header> r2 = org.jcodec.containers.mp4.boxes.Header.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L34
            java.lang.reflect.Constructor r4 = r4.getConstructor(r1)     // Catch: java.lang.Exception -> L34
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L34
            org.jcodec.containers.mp4.boxes.Header r1 = r5.getHeader()     // Catch: java.lang.Exception -> L34
            r0[r3] = r1     // Catch: java.lang.Exception -> L34
            java.lang.Object r4 = r4.newInstance(r0)     // Catch: java.lang.Exception -> L34
            org.jcodec.containers.mp4.boxes.Box r4 = (org.jcodec.containers.mp4.boxes.Box) r4     // Catch: java.lang.Exception -> L34
            org.jcodec.containers.mp4.boxes.Header r0 = r5.getHeader()     // Catch: java.lang.Exception -> L34
            long r0 = r0.getBodySize()     // Catch: java.lang.Exception -> L34
            int r1 = (int) r0     // Catch: java.lang.Exception -> L34
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)     // Catch: java.lang.Exception -> L34
            r5.doWrite(r0)     // Catch: java.lang.Exception -> L34
            java.nio.Buffer r5 = r0.flip()     // Catch: java.lang.Exception -> L34
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5     // Catch: java.lang.Exception -> L34
            r4.parse(r0)     // Catch: java.lang.Exception -> L34
            return r4
        L34:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
    }

    private void checkWrongSignature(java.lang.Class r6) {
            r5 = this;
            java.lang.reflect.Method[] r0 = org.jcodec.platform.Platform.getDeclaredMethods(r6)
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L37
            r3 = r0[r2]
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "getModelFields"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L34
            java.lang.String r6 = r6.getCanonicalName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Class "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " contains 'getModelFields' of wrong signature.\nDid you mean to define 'protected void getModelFields(List<String> model) ?"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            org.jcodec.common.logging.Logger.warn(r6)
            goto L37
        L34:
            int r2 = r2 + 1
            goto L6
        L37:
            return
    }

    public static <T extends org.jcodec.containers.mp4.boxes.Box> T[] findAll(org.jcodec.containers.mp4.boxes.Box r2, java.lang.Class<T> r3, java.lang.String r4) {
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r4
            org.jcodec.containers.mp4.boxes.Box[] r2 = findAllPath(r2, r3, r0)
            return r2
    }

    public static <T extends org.jcodec.containers.mp4.boxes.Box> T[] findAllPath(org.jcodec.containers.mp4.boxes.Box r6, java.lang.Class<T> r7, java.lang.String[] r8) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            int r2 = r8.length
            r3 = 0
            r4 = 0
        Ld:
            if (r4 >= r2) goto L17
            r5 = r8[r4]
            r1.add(r5)
            int r4 = r4 + 1
            goto Ld
        L17:
            findBox(r6, r1, r0)
            java.util.ListIterator r6 = r0.listIterator()
        L1e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L77
            java.lang.Object r8 = r6.next()
            org.jcodec.containers.mp4.boxes.Box r8 = (org.jcodec.containers.mp4.boxes.Box) r8
            if (r8 != 0) goto L30
            r6.remove()
            goto L1e
        L30:
            java.lang.Class r1 = r8.getClass()
            boolean r1 = r7.isAssignableFrom(r1)
            if (r1 != 0) goto L1e
            org.jcodec.containers.mp4.boxes.Box r1 = asBox(r7, r8)     // Catch: java.lang.Exception -> L42
            r6.set(r1)     // Catch: java.lang.Exception -> L42
            goto L1e
        L42:
            r1 = move-exception
            java.lang.String r8 = r8.getFourcc()
            java.lang.String r2 = r7.getName()
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to reinterpret box: "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r8 = " as: "
            r4.append(r8)
            r4.append(r2)
            java.lang.String r8 = "."
            r4.append(r8)
            r4.append(r1)
            java.lang.String r8 = r4.toString()
            org.jcodec.common.logging.Logger.warn(r8)
            r6.remove()
            goto L1e
        L77:
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r7, r3)
            org.jcodec.containers.mp4.boxes.Box[] r6 = (org.jcodec.containers.mp4.boxes.Box[]) r6
            java.lang.Object[] r6 = r0.toArray(r6)
            org.jcodec.containers.mp4.boxes.Box[] r6 = (org.jcodec.containers.mp4.boxes.Box[]) r6
            return r6
    }

    public static void findBox(org.jcodec.containers.mp4.boxes.Box r4, java.util.List<java.lang.String> r5, java.util.Collection<org.jcodec.containers.mp4.boxes.Box> r6) {
            int r0 = r5.size()
            if (r0 <= 0) goto L3d
            r0 = 0
            java.lang.Object r1 = r5.remove(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r4 instanceof org.jcodec.containers.mp4.boxes.NodeBox
            if (r2 == 0) goto L39
            org.jcodec.containers.mp4.boxes.NodeBox r4 = (org.jcodec.containers.mp4.boxes.NodeBox) r4
            java.util.List r4 = r4.getBoxes()
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r4.next()
            org.jcodec.containers.mp4.boxes.Box r2 = (org.jcodec.containers.mp4.boxes.Box) r2
            if (r1 == 0) goto L35
            org.jcodec.containers.mp4.boxes.Header r3 = r2.header
            java.lang.String r3 = r3.getFourcc()
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L1b
        L35:
            findBox(r2, r5, r6)
            goto L1b
        L39:
            r5.add(r0, r1)
            goto L40
        L3d:
            r6.add(r4)
        L40:
            return
    }

    public static <T extends org.jcodec.containers.mp4.boxes.Box> T findFirst(org.jcodec.containers.mp4.boxes.NodeBox r2, java.lang.Class<T> r3, java.lang.String r4) {
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r4
            org.jcodec.containers.mp4.boxes.Box r2 = findFirstPath(r2, r3, r0)
            return r2
    }

    public static <T extends org.jcodec.containers.mp4.boxes.Box> T findFirstPath(org.jcodec.containers.mp4.boxes.NodeBox r0, java.lang.Class<T> r1, java.lang.String[] r2) {
            org.jcodec.containers.mp4.boxes.Box[] r0 = findAllPath(r0, r1, r2)
            int r1 = r0.length
            if (r1 <= 0) goto Lb
            r1 = 0
            r0 = r0[r1]
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public static java.lang.String[] path(java.lang.String r1) {
            r0 = 46
            java.lang.String[] r1 = org.jcodec.common.StringUtils.splitC(r1, r0)
            return r1
    }

    protected void collectModel(java.lang.Class r4, java.util.List<java.lang.String> r5) {
            r3 = this;
            java.lang.Class<org.jcodec.containers.mp4.boxes.Box> r0 = org.jcodec.containers.mp4.boxes.Box.class
            if (r0 == r4) goto L28
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 != 0) goto Lb
            goto L28
        Lb:
            java.lang.Class r0 = r4.getSuperclass()
            r3.collectModel(r0, r5)
            java.lang.String r0 = "getModelFields"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.Exception -> L28
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.Exception -> L28
            org.jcodec.platform.Platform.invokeMethod(r3, r0, r1)     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.Exception -> L28
            goto L28
        L1e:
            r3.checkWrongSignature(r4)
            java.util.List r4 = org.jcodec.common.tools.ToJSON.allFields(r4)
            r5.addAll(r4)
        L28:
            return
    }

    protected abstract void doWrite(java.nio.ByteBuffer r1);

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
            java.lang.String r0 = "}"
            r4.append(r0)
            return
    }

    public java.lang.String getFourcc() {
            r1 = this;
            org.jcodec.containers.mp4.boxes.Header r0 = r1.header
            java.lang.String r0 = r0.getFourcc()
            return r0
    }

    public org.jcodec.containers.mp4.boxes.Header getHeader() {
            r1 = this;
            org.jcodec.containers.mp4.boxes.Header r0 = r1.header
            return r0
    }

    public abstract void parse(java.nio.ByteBuffer r1);

    public java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.dump(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void write(java.nio.ByteBuffer r5) {
            r4 = this;
            java.nio.ByteBuffer r0 = r5.duplicate()
            r1 = 8
            org.jcodec.common.io.NIOUtils.skip(r5, r1)
            r4.doWrite(r5)
            org.jcodec.containers.mp4.boxes.Header r2 = r4.header
            int r5 = r5.position()
            int r3 = r0.position()
            int r5 = r5 - r3
            int r5 = r5 - r1
            r2.setBodySize(r5)
            org.jcodec.containers.mp4.boxes.Header r5 = r4.header
            long r2 = r5.headerSize()
            org.jcodec.common.Assert.assertEquals(r2, r1)
            org.jcodec.containers.mp4.boxes.Header r5 = r4.header
            r5.write(r0)
            return
    }
}
