package androidx.work;

/* loaded from: classes.dex */
public final class Data {
    public static final androidx.work.Data EMPTY = null;
    private static final java.lang.String TAG = null;
    java.util.Map<java.lang.String, java.lang.Object> mValues;

    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.Object> mValues;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mValues = r0
                return
        }

        public androidx.work.Data build() {
                r2 = this;
                androidx.work.Data r0 = new androidx.work.Data
                java.util.Map<java.lang.String, java.lang.Object> r1 = r2.mValues
                r0.<init>(r1)
                androidx.work.Data.toByteArrayInternal(r0)
                return r0
        }

        public androidx.work.Data.Builder put(java.lang.String r4, java.lang.Object r5) {
                r3 = this;
                if (r5 != 0) goto La
                java.util.Map<java.lang.String, java.lang.Object> r5 = r3.mValues
                r0 = 0
                r5.put(r4, r0)
                goto Lc2
            La:
                java.lang.Class r0 = r5.getClass()
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                if (r0 == r1) goto Lbd
                java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
                if (r0 == r1) goto Lbd
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                if (r0 == r1) goto Lbd
                java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
                if (r0 == r1) goto Lbd
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                if (r0 == r1) goto Lbd
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                if (r0 == r1) goto Lbd
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                if (r0 == r1) goto Lbd
                java.lang.Class<java.lang.Boolean[]> r1 = java.lang.Boolean[].class
                if (r0 == r1) goto Lbd
                java.lang.Class<java.lang.Byte[]> r1 = java.lang.Byte[].class
                if (r0 == r1) goto Lbd
                java.lang.Class<java.lang.Integer[]> r1 = java.lang.Integer[].class
                if (r0 == r1) goto Lbd
                java.lang.Class<java.lang.Long[]> r1 = java.lang.Long[].class
                if (r0 == r1) goto Lbd
                java.lang.Class<java.lang.Float[]> r1 = java.lang.Float[].class
                if (r0 == r1) goto Lbd
                java.lang.Class<java.lang.Double[]> r1 = java.lang.Double[].class
                if (r0 == r1) goto Lbd
                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                if (r0 != r1) goto L48
                goto Lbd
            L48:
                java.lang.Class<boolean[]> r1 = boolean[].class
                if (r0 != r1) goto L58
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                boolean[] r5 = (boolean[]) r5
                java.lang.Boolean[] r5 = androidx.work.Data.convertPrimitiveBooleanArray(r5)
                r0.put(r4, r5)
                goto Lc2
            L58:
                java.lang.Class<byte[]> r1 = byte[].class
                if (r0 != r1) goto L68
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                byte[] r5 = (byte[]) r5
                java.lang.Byte[] r5 = androidx.work.Data.convertPrimitiveByteArray(r5)
                r0.put(r4, r5)
                goto Lc2
            L68:
                java.lang.Class<int[]> r1 = int[].class
                if (r0 != r1) goto L78
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                int[] r5 = (int[]) r5
                java.lang.Integer[] r5 = androidx.work.Data.convertPrimitiveIntArray(r5)
                r0.put(r4, r5)
                goto Lc2
            L78:
                java.lang.Class<long[]> r1 = long[].class
                if (r0 != r1) goto L88
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                long[] r5 = (long[]) r5
                java.lang.Long[] r5 = androidx.work.Data.convertPrimitiveLongArray(r5)
                r0.put(r4, r5)
                goto Lc2
            L88:
                java.lang.Class<float[]> r1 = float[].class
                if (r0 != r1) goto L98
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                float[] r5 = (float[]) r5
                java.lang.Float[] r5 = androidx.work.Data.convertPrimitiveFloatArray(r5)
                r0.put(r4, r5)
                goto Lc2
            L98:
                java.lang.Class<double[]> r1 = double[].class
                if (r0 != r1) goto La8
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                double[] r5 = (double[]) r5
                java.lang.Double[] r5 = androidx.work.Data.convertPrimitiveDoubleArray(r5)
                r0.put(r4, r5)
                goto Lc2
            La8:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                r4 = 1
                r1[r4] = r0
                java.lang.String r4 = "Key %s has invalid type %s"
                java.lang.String r4 = java.lang.String.format(r4, r1)
                r5.<init>(r4)
                throw r5
            Lbd:
                java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mValues
                r0.put(r4, r5)
            Lc2:
                return r3
        }

        public androidx.work.Data.Builder putAll(androidx.work.Data r1) {
                r0 = this;
                java.util.Map<java.lang.String, java.lang.Object> r1 = r1.mValues
                r0.putAll(r1)
                return r0
        }

        public androidx.work.Data.Builder putAll(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L8:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L22
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r0 = r0.getValue()
                r2.put(r1, r0)
                goto L8
            L22:
                return r2
        }

        public androidx.work.Data.Builder putString(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
                r0.put(r2, r3)
                return r1
        }
    }

    static {
            java.lang.String r0 = "Data"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.Data.TAG = r0
            androidx.work.Data$Builder r0 = new androidx.work.Data$Builder
            r0.<init>()
            androidx.work.Data r0 = r0.build()
            androidx.work.Data.EMPTY = r0
            return
    }

    Data() {
            r0 = this;
            r0.<init>()
            return
    }

    public Data(androidx.work.Data r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.mValues
            r0.<init>(r2)
            r1.mValues = r0
            return
    }

    public Data(java.util.Map<java.lang.String, ?> r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            r1.mValues = r0
            return
    }

    public static java.lang.Boolean[] convertPrimitiveBooleanArray(boolean[] r3) {
            int r0 = r3.length
            java.lang.Boolean[] r0 = new java.lang.Boolean[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            boolean r2 = r3[r1]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    public static java.lang.Byte[] convertPrimitiveByteArray(byte[] r3) {
            int r0 = r3.length
            java.lang.Byte[] r0 = new java.lang.Byte[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    public static java.lang.Double[] convertPrimitiveDoubleArray(double[] r4) {
            int r0 = r4.length
            java.lang.Double[] r0 = new java.lang.Double[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L12
            r2 = r4[r1]
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    public static java.lang.Float[] convertPrimitiveFloatArray(float[] r3) {
            int r0 = r3.length
            java.lang.Float[] r0 = new java.lang.Float[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    public static java.lang.Integer[] convertPrimitiveIntArray(int[] r3) {
            int r0 = r3.length
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    public static java.lang.Long[] convertPrimitiveLongArray(long[] r4) {
            int r0 = r4.length
            java.lang.Long[] r0 = new java.lang.Long[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L12
            r2 = r4[r1]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    public static androidx.work.Data fromByteArray(byte[] r7) {
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L80
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            int r7 = r3.readInt()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            r1.put(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = androidx.work.Data.TAG
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L39:
            r7 = move-exception
            goto L47
        L3b:
            r7 = move-exception
            goto L47
        L3d:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L69
        L41:
            r3 = move-exception
            goto L44
        L43:
            r3 = move-exception
        L44:
            r6 = r3
            r3 = r7
            r7 = r6
        L47:
            java.lang.String r4 = androidx.work.Data.TAG     // Catch: java.lang.Throwable -> L68
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L58
            r3.close()     // Catch: java.io.IOException -> L52
            goto L58
        L52:
            r7 = move-exception
            java.lang.String r3 = androidx.work.Data.TAG
            android.util.Log.e(r3, r0, r7)
        L58:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L5c:
            r7 = move-exception
            java.lang.String r2 = androidx.work.Data.TAG
            android.util.Log.e(r2, r0, r7)
        L62:
            androidx.work.Data r7 = new androidx.work.Data
            r7.<init>(r1)
            return r7
        L68:
            r7 = move-exception
        L69:
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L75
        L6f:
            r1 = move-exception
            java.lang.String r3 = androidx.work.Data.TAG
            android.util.Log.e(r3, r0, r1)
        L75:
            r2.close()     // Catch: java.io.IOException -> L79
            goto L7f
        L79:
            r1 = move-exception
            java.lang.String r2 = androidx.work.Data.TAG
            android.util.Log.e(r2, r0, r1)
        L7f:
            throw r7
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
    }

    public static byte[] toByteArrayInternal(androidx.work.Data r5) {
            java.lang.String r0 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            int r2 = r5.size()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r3.writeInt(r2)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.mValues     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
        L1e:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r3.writeUTF(r4)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r3.writeObject(r2)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            goto L1e
        L3b:
            r3.close()     // Catch: java.io.IOException -> L3f
            goto L45
        L3f:
            r5 = move-exception
            java.lang.String r2 = androidx.work.Data.TAG
            android.util.Log.e(r2, r0, r5)
        L45:
            r1.close()     // Catch: java.io.IOException -> L49
            goto L4f
        L49:
            r5 = move-exception
            java.lang.String r2 = androidx.work.Data.TAG
            android.util.Log.e(r2, r0, r5)
        L4f:
            int r5 = r1.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r5 > r0) goto L5c
            byte[] r5 = r1.toByteArray()
            return r5
        L5c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        L64:
            r5 = move-exception
            r2 = r3
            goto L8d
        L67:
            r5 = move-exception
            r2 = r3
            goto L6d
        L6a:
            r5 = move-exception
            goto L8d
        L6c:
            r5 = move-exception
        L6d:
            java.lang.String r3 = androidx.work.Data.TAG     // Catch: java.lang.Throwable -> L6a
            android.util.Log.e(r3, r0, r5)     // Catch: java.lang.Throwable -> L6a
            byte[] r5 = r1.toByteArray()     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L82
            r2.close()     // Catch: java.io.IOException -> L7c
            goto L82
        L7c:
            r2 = move-exception
            java.lang.String r3 = androidx.work.Data.TAG
            android.util.Log.e(r3, r0, r2)
        L82:
            r1.close()     // Catch: java.io.IOException -> L86
            goto L8c
        L86:
            r1 = move-exception
            java.lang.String r2 = androidx.work.Data.TAG
            android.util.Log.e(r2, r0, r1)
        L8c:
            return r5
        L8d:
            if (r2 == 0) goto L99
            r2.close()     // Catch: java.io.IOException -> L93
            goto L99
        L93:
            r2 = move-exception
            java.lang.String r3 = androidx.work.Data.TAG
            android.util.Log.e(r3, r0, r2)
        L99:
            r1.close()     // Catch: java.io.IOException -> L9d
            goto La3
        L9d:
            r1 = move-exception
            java.lang.String r2 = androidx.work.Data.TAG
            android.util.Log.e(r2, r0, r1)
        La3:
            throw r5
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L65
            java.lang.Class<androidx.work.Data> r2 = androidx.work.Data.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L65
        L10:
            androidx.work.Data r7 = (androidx.work.Data) r7
            java.util.Map<java.lang.String, java.lang.Object> r2 = r6.mValues
            java.util.Set r2 = r2.keySet()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.mValues
            java.util.Set r3 = r3.keySet()
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L25
            return r1
        L25:
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L64
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.Object> r4 = r6.mValues
            java.lang.Object r4 = r4.get(r3)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.mValues
            java.lang.Object r3 = r5.get(r3)
            if (r4 == 0) goto L5c
            if (r3 != 0) goto L46
            goto L5c
        L46:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L57
            boolean r5 = r3 instanceof java.lang.Object[]
            if (r5 == 0) goto L57
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = java.util.Arrays.deepEquals(r4, r3)
            goto L61
        L57:
            boolean r3 = r4.equals(r3)
            goto L61
        L5c:
            if (r4 != r3) goto L60
            r3 = 1
            goto L61
        L60:
            r3 = 0
        L61:
            if (r3 != 0) goto L29
            return r1
        L64:
            return r0
        L65:
            return r1
    }

    public java.util.Map<java.lang.String, java.lang.Object> getKeyValueMap() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    public java.lang.String getString(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Ld
            java.lang.String r2 = (java.lang.String) r2
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }

    public int size() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mValues
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Data {"
            r0.<init>(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.mValues
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.mValues
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r3 = " : "
            r0.append(r3)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r4.mValues
            java.lang.Object r2 = r3.get(r2)
            boolean r3 = r2 instanceof java.lang.Object[]
            if (r3 == 0) goto L41
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            goto L44
        L41:
            r0.append(r2)
        L44:
            java.lang.String r2 = ", "
            r0.append(r2)
            goto L19
        L4a:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
