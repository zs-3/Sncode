package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class UnsafeUtil {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET = 0;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE = 0;
    private static final long BUFFER_ADDRESS_OFFSET = 0;
    private static final int BYTE_ARRAY_ALIGNMENT = 0;
    static final long BYTE_ARRAY_BASE_OFFSET = 0;
    private static final long DOUBLE_ARRAY_BASE_OFFSET = 0;
    private static final long DOUBLE_ARRAY_INDEX_SCALE = 0;
    private static final long FLOAT_ARRAY_BASE_OFFSET = 0;
    private static final long FLOAT_ARRAY_INDEX_SCALE = 0;
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = false;
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = false;
    private static final long INT_ARRAY_BASE_OFFSET = 0;
    private static final long INT_ARRAY_INDEX_SCALE = 0;
    private static final boolean IS_ANDROID_32 = false;
    private static final boolean IS_ANDROID_64 = false;
    static final boolean IS_BIG_ENDIAN = false;
    private static final long LONG_ARRAY_BASE_OFFSET = 0;
    private static final long LONG_ARRAY_INDEX_SCALE = 0;
    private static final androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor MEMORY_ACCESSOR = null;
    private static final java.lang.Class<?> MEMORY_CLASS = null;
    private static final long OBJECT_ARRAY_BASE_OFFSET = 0;
    private static final long OBJECT_ARRAY_INDEX_SCALE = 0;
    private static final sun.misc.Unsafe UNSAFE = null;
    private static final java.util.logging.Logger logger = null;


    private static final class Android32MemoryAccessor extends androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor {
        Android32MemoryAccessor(sun.misc.Unsafe r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(java.lang.Object r2, long r3) {
                r1 = this;
                boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L9
                boolean r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.access$400(r2, r3)
                return r2
            L9:
                boolean r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.access$500(r2, r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(java.lang.Object r2, long r3) {
                r1 = this;
                boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L9
                byte r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.access$000(r2, r3)
                return r2
            L9:
                byte r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.access$100(r2, r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(java.lang.Object r1, long r2) {
                r0 = this;
                long r1 = r0.getLong(r1, r2)
                double r1 = java.lang.Double.longBitsToDouble(r1)
                return r1
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(java.lang.Object r1, long r2) {
                r0 = this;
                int r1 = r0.getInt(r1, r2)
                float r1 = java.lang.Float.intBitsToFloat(r1)
                return r1
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(java.lang.Object r2, long r3, boolean r5) {
                r1 = this;
                boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L8
                androidx.datastore.preferences.protobuf.UnsafeUtil.access$600(r2, r3, r5)
                goto Lb
            L8:
                androidx.datastore.preferences.protobuf.UnsafeUtil.access$700(r2, r3, r5)
            Lb:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(java.lang.Object r2, long r3, byte r5) {
                r1 = this;
                boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L8
                androidx.datastore.preferences.protobuf.UnsafeUtil.access$200(r2, r3, r5)
                goto Lb
            L8:
                androidx.datastore.preferences.protobuf.UnsafeUtil.access$300(r2, r3, r5)
            Lb:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(java.lang.Object r7, long r8, double r10) {
                r6 = this;
                long r4 = java.lang.Double.doubleToLongBits(r10)
                r0 = r6
                r1 = r7
                r2 = r8
                r0.putLong(r1, r2, r4)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(java.lang.Object r1, long r2, float r4) {
                r0 = this;
                int r4 = java.lang.Float.floatToIntBits(r4)
                r0.putInt(r1, r2, r4)
                return
        }
    }

    private static final class Android64MemoryAccessor extends androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor {
        Android64MemoryAccessor(sun.misc.Unsafe r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(java.lang.Object r2, long r3) {
                r1 = this;
                boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L9
                boolean r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.access$400(r2, r3)
                return r2
            L9:
                boolean r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.access$500(r2, r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(java.lang.Object r2, long r3) {
                r1 = this;
                boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L9
                byte r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.access$000(r2, r3)
                return r2
            L9:
                byte r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.access$100(r2, r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(java.lang.Object r1, long r2) {
                r0 = this;
                long r1 = r0.getLong(r1, r2)
                double r1 = java.lang.Double.longBitsToDouble(r1)
                return r1
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(java.lang.Object r1, long r2) {
                r0 = this;
                int r1 = r0.getInt(r1, r2)
                float r1 = java.lang.Float.intBitsToFloat(r1)
                return r1
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(java.lang.Object r2, long r3, boolean r5) {
                r1 = this;
                boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L8
                androidx.datastore.preferences.protobuf.UnsafeUtil.access$600(r2, r3, r5)
                goto Lb
            L8:
                androidx.datastore.preferences.protobuf.UnsafeUtil.access$700(r2, r3, r5)
            Lb:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(java.lang.Object r2, long r3, byte r5) {
                r1 = this;
                boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN
                if (r0 == 0) goto L8
                androidx.datastore.preferences.protobuf.UnsafeUtil.access$200(r2, r3, r5)
                goto Lb
            L8:
                androidx.datastore.preferences.protobuf.UnsafeUtil.access$300(r2, r3, r5)
            Lb:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(java.lang.Object r7, long r8, double r10) {
                r6 = this;
                long r4 = java.lang.Double.doubleToLongBits(r10)
                r0 = r6
                r1 = r7
                r2 = r8
                r0.putLong(r1, r2, r4)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(java.lang.Object r1, long r2, float r4) {
                r0 = this;
                int r4 = java.lang.Float.floatToIntBits(r4)
                r0.putInt(r1, r2, r4)
                return
        }
    }

    private static final class JvmMemoryAccessor extends androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor {
        JvmMemoryAccessor(sun.misc.Unsafe r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                boolean r2 = r0.getBoolean(r2, r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                byte r2 = r0.getByte(r2, r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                double r2 = r0.getDouble(r2, r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                float r2 = r0.getFloat(r2, r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(java.lang.Object r2, long r3, boolean r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                r0.putBoolean(r2, r3, r5)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(java.lang.Object r2, long r3, byte r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                r0.putByte(r2, r3, r5)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(java.lang.Object r7, long r8, double r10) {
                r6 = this;
                sun.misc.Unsafe r0 = r6.unsafe
                r1 = r7
                r2 = r8
                r4 = r10
                r0.putDouble(r1, r2, r4)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(java.lang.Object r2, long r3, float r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                r0.putFloat(r2, r3, r5)
                return
        }
    }

    private static abstract class MemoryAccessor {
        sun.misc.Unsafe unsafe;

        MemoryAccessor(sun.misc.Unsafe r1) {
                r0 = this;
                r0.<init>()
                r0.unsafe = r1
                return
        }

        public final int arrayBaseOffset(java.lang.Class<?> r2) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                int r2 = r0.arrayBaseOffset(r2)
                return r2
        }

        public final int arrayIndexScale(java.lang.Class<?> r2) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                int r2 = r0.arrayIndexScale(r2)
                return r2
        }

        public abstract boolean getBoolean(java.lang.Object r1, long r2);

        public abstract byte getByte(java.lang.Object r1, long r2);

        public abstract double getDouble(java.lang.Object r1, long r2);

        public abstract float getFloat(java.lang.Object r1, long r2);

        public final int getInt(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                int r2 = r0.getInt(r2, r3)
                return r2
        }

        public final long getLong(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                long r2 = r0.getLong(r2, r3)
                return r2
        }

        public final java.lang.Object getObject(java.lang.Object r2, long r3) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                java.lang.Object r2 = r0.getObject(r2, r3)
                return r2
        }

        public final long objectFieldOffset(java.lang.reflect.Field r3) {
                r2 = this;
                sun.misc.Unsafe r0 = r2.unsafe
                long r0 = r0.objectFieldOffset(r3)
                return r0
        }

        public abstract void putBoolean(java.lang.Object r1, long r2, boolean r4);

        public abstract void putByte(java.lang.Object r1, long r2, byte r4);

        public abstract void putDouble(java.lang.Object r1, long r2, double r4);

        public abstract void putFloat(java.lang.Object r1, long r2, float r4);

        public final void putInt(java.lang.Object r2, long r3, int r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                r0.putInt(r2, r3, r5)
                return
        }

        public final void putLong(java.lang.Object r7, long r8, long r10) {
                r6 = this;
                sun.misc.Unsafe r0 = r6.unsafe
                r1 = r7
                r2 = r8
                r4 = r10
                r0.putLong(r1, r2, r4)
                return
        }

        public final void putObject(java.lang.Object r2, long r3, java.lang.Object r5) {
                r1 = this;
                sun.misc.Unsafe r0 = r1.unsafe
                r0.putObject(r2, r3, r5)
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<androidx.datastore.preferences.protobuf.UnsafeUtil> r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.class
            java.lang.String r6 = r6.getName()
            java.util.logging.Logger r6 = java.util.logging.Logger.getLogger(r6)
            androidx.datastore.preferences.protobuf.UnsafeUtil.logger = r6
            sun.misc.Unsafe r6 = getUnsafe()
            androidx.datastore.preferences.protobuf.UnsafeUtil.UNSAFE = r6
            java.lang.Class r6 = androidx.datastore.preferences.protobuf.Android.getMemoryClass()
            androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_CLASS = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r6 = determineAndroidSupportByAddressSize(r6)
            androidx.datastore.preferences.protobuf.UnsafeUtil.IS_ANDROID_64 = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r6 = determineAndroidSupportByAddressSize(r6)
            androidx.datastore.preferences.protobuf.UnsafeUtil.IS_ANDROID_32 = r6
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r6 = getMemoryAccessor()
            androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR = r6
            boolean r6 = supportsUnsafeByteBufferOperations()
            androidx.datastore.preferences.protobuf.UnsafeUtil.HAS_UNSAFE_BYTEBUFFER_OPERATIONS = r6
            boolean r6 = supportsUnsafeArrayOperations()
            androidx.datastore.preferences.protobuf.UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = arrayBaseOffset(r6)
            long r6 = (long) r6
            androidx.datastore.preferences.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET = r6
            int r8 = arrayBaseOffset(r5)
            long r8 = (long) r8
            androidx.datastore.preferences.protobuf.UnsafeUtil.BOOLEAN_ARRAY_BASE_OFFSET = r8
            int r5 = arrayIndexScale(r5)
            long r8 = (long) r5
            androidx.datastore.preferences.protobuf.UnsafeUtil.BOOLEAN_ARRAY_INDEX_SCALE = r8
            int r5 = arrayBaseOffset(r4)
            long r8 = (long) r5
            androidx.datastore.preferences.protobuf.UnsafeUtil.INT_ARRAY_BASE_OFFSET = r8
            int r4 = arrayIndexScale(r4)
            long r4 = (long) r4
            androidx.datastore.preferences.protobuf.UnsafeUtil.INT_ARRAY_INDEX_SCALE = r4
            int r4 = arrayBaseOffset(r3)
            long r4 = (long) r4
            androidx.datastore.preferences.protobuf.UnsafeUtil.LONG_ARRAY_BASE_OFFSET = r4
            int r3 = arrayIndexScale(r3)
            long r3 = (long) r3
            androidx.datastore.preferences.protobuf.UnsafeUtil.LONG_ARRAY_INDEX_SCALE = r3
            int r3 = arrayBaseOffset(r2)
            long r3 = (long) r3
            androidx.datastore.preferences.protobuf.UnsafeUtil.FLOAT_ARRAY_BASE_OFFSET = r3
            int r2 = arrayIndexScale(r2)
            long r2 = (long) r2
            androidx.datastore.preferences.protobuf.UnsafeUtil.FLOAT_ARRAY_INDEX_SCALE = r2
            int r2 = arrayBaseOffset(r1)
            long r2 = (long) r2
            androidx.datastore.preferences.protobuf.UnsafeUtil.DOUBLE_ARRAY_BASE_OFFSET = r2
            int r1 = arrayIndexScale(r1)
            long r1 = (long) r1
            androidx.datastore.preferences.protobuf.UnsafeUtil.DOUBLE_ARRAY_INDEX_SCALE = r1
            int r1 = arrayBaseOffset(r0)
            long r1 = (long) r1
            androidx.datastore.preferences.protobuf.UnsafeUtil.OBJECT_ARRAY_BASE_OFFSET = r1
            int r0 = arrayIndexScale(r0)
            long r0 = (long) r0
            androidx.datastore.preferences.protobuf.UnsafeUtil.OBJECT_ARRAY_INDEX_SCALE = r0
            java.lang.reflect.Field r0 = bufferAddressField()
            long r0 = fieldOffset(r0)
            androidx.datastore.preferences.protobuf.UnsafeUtil.BUFFER_ADDRESS_OFFSET = r0
            r0 = 7
            long r0 = r0 & r6
            int r1 = (int) r0
            androidx.datastore.preferences.protobuf.UnsafeUtil.BYTE_ARRAY_ALIGNMENT = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Lbd
            r0 = 1
            goto Lbe
        Lbd:
            r0 = 0
        Lbe:
            androidx.datastore.preferences.protobuf.UnsafeUtil.IS_BIG_ENDIAN = r0
            return
    }

    private UnsafeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ byte access$000(java.lang.Object r0, long r1) {
            byte r0 = getByteBigEndian(r0, r1)
            return r0
    }

    static /* synthetic */ byte access$100(java.lang.Object r0, long r1) {
            byte r0 = getByteLittleEndian(r0, r1)
            return r0
    }

    static /* synthetic */ void access$200(java.lang.Object r0, long r1, byte r3) {
            putByteBigEndian(r0, r1, r3)
            return
    }

    static /* synthetic */ void access$300(java.lang.Object r0, long r1, byte r3) {
            putByteLittleEndian(r0, r1, r3)
            return
    }

    static /* synthetic */ boolean access$400(java.lang.Object r0, long r1) {
            boolean r0 = getBooleanBigEndian(r0, r1)
            return r0
    }

    static /* synthetic */ boolean access$500(java.lang.Object r0, long r1) {
            boolean r0 = getBooleanLittleEndian(r0, r1)
            return r0
    }

    static /* synthetic */ void access$600(java.lang.Object r0, long r1, boolean r3) {
            putBooleanBigEndian(r0, r1, r3)
            return
    }

    static /* synthetic */ void access$700(java.lang.Object r0, long r1, boolean r3) {
            putBooleanLittleEndian(r0, r1, r3)
            return
    }

    static <T> T allocateInstance(java.lang.Class<T> r1) {
            sun.misc.Unsafe r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.UNSAFE     // Catch: java.lang.InstantiationException -> L7
            java.lang.Object r1 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    private static int arrayBaseOffset(java.lang.Class<?> r1) {
            boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS
            if (r0 == 0) goto Lb
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            int r1 = r0.arrayBaseOffset(r1)
            goto Lc
        Lb:
            r1 = -1
        Lc:
            return r1
    }

    private static int arrayIndexScale(java.lang.Class<?> r1) {
            boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS
            if (r0 == 0) goto Lb
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            int r1 = r0.arrayIndexScale(r1)
            goto Lc
        Lb:
            r1 = -1
        Lc:
            return r1
    }

    private static java.lang.reflect.Field bufferAddressField() {
            boolean r0 = androidx.datastore.preferences.protobuf.Android.isOnAndroidDevice()
            if (r0 == 0) goto L11
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r1 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = field(r0, r1)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r1 = "address"
            java.lang.reflect.Field r0 = field(r0, r1)
            if (r0 == 0) goto L24
            java.lang.Class r1 = r0.getType()
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 != r2) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
    }

    private static boolean determineAndroidSupportByAddressSize(java.lang.Class<?> r10) {
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r1 = androidx.datastore.preferences.protobuf.Android.isOnAndroidDevice()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.Class<?> r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_CLASS     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "peekLong"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L7b
            r5[r2] = r10     // Catch: java.lang.Throwable -> L7b
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L7b
            r7 = 1
            r5[r7] = r6     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "pokeLong"
            r5 = 3
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L7b
            r8[r2] = r10     // Catch: java.lang.Throwable -> L7b
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L7b
            r8[r7] = r9     // Catch: java.lang.Throwable -> L7b
            r8[r4] = r6     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "pokeInt"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L7b
            r8[r2] = r10     // Catch: java.lang.Throwable -> L7b
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L7b
            r8[r7] = r9     // Catch: java.lang.Throwable -> L7b
            r8[r4] = r6     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "peekInt"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L7b
            r8[r2] = r10     // Catch: java.lang.Throwable -> L7b
            r8[r7] = r6     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "pokeByte"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L7b
            r6[r2] = r10     // Catch: java.lang.Throwable -> L7b
            java.lang.Class r8 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L7b
            r6[r7] = r8     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "peekByte"
            java.lang.Class[] r6 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L7b
            r6[r2] = r10     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "pokeByteArray"
            r6 = 4
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L7b
            r8[r2] = r10     // Catch: java.lang.Throwable -> L7b
            r8[r7] = r0     // Catch: java.lang.Throwable -> L7b
            r8[r4] = r9     // Catch: java.lang.Throwable -> L7b
            r8[r5] = r9     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "peekByteArray"
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L7b
            r6[r2] = r10     // Catch: java.lang.Throwable -> L7b
            r6[r7] = r0     // Catch: java.lang.Throwable -> L7b
            r6[r4] = r9     // Catch: java.lang.Throwable -> L7b
            r6[r5] = r9     // Catch: java.lang.Throwable -> L7b
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L7b
            return r7
        L7b:
            return r2
    }

    private static java.lang.reflect.Field field(java.lang.Class<?> r0, java.lang.String r1) {
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    private static long fieldOffset(java.lang.reflect.Field r2) {
            if (r2 == 0) goto Lc
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            if (r0 != 0) goto L7
            goto Lc
        L7:
            long r0 = r0.objectFieldOffset(r2)
            goto Le
        Lc:
            r0 = -1
        Le:
            return r0
    }

    static boolean getBoolean(java.lang.Object r1, long r2) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            boolean r1 = r0.getBoolean(r1, r2)
            return r1
    }

    private static boolean getBooleanBigEndian(java.lang.Object r0, long r1) {
            byte r0 = getByteBigEndian(r0, r1)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static boolean getBooleanLittleEndian(java.lang.Object r0, long r1) {
            byte r0 = getByteLittleEndian(r0, r1)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    static byte getByte(byte[] r3, long r4) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET
            long r1 = r1 + r4
            byte r3 = r0.getByte(r3, r1)
            return r3
    }

    private static byte getByteBigEndian(java.lang.Object r2, long r3) {
            r0 = -4
            long r0 = r0 & r3
            int r2 = getInt(r2, r0)
            long r3 = ~r3
            r0 = 3
            long r3 = r3 & r0
            r0 = 3
            long r3 = r3 << r0
            int r4 = (int) r3
            int r2 = r2 >>> r4
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            return r2
    }

    private static byte getByteLittleEndian(java.lang.Object r2, long r3) {
            r0 = -4
            long r0 = r0 & r3
            int r2 = getInt(r2, r0)
            r0 = 3
            long r3 = r3 & r0
            r0 = 3
            long r3 = r3 << r0
            int r4 = (int) r3
            int r2 = r2 >>> r4
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            return r2
    }

    static double getDouble(java.lang.Object r1, long r2) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            double r1 = r0.getDouble(r1, r2)
            return r1
    }

    static float getFloat(java.lang.Object r1, long r2) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            float r1 = r0.getFloat(r1, r2)
            return r1
    }

    static int getInt(java.lang.Object r1, long r2) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            int r1 = r0.getInt(r1, r2)
            return r1
    }

    static long getLong(java.lang.Object r1, long r2) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = r0.getLong(r1, r2)
            return r1
    }

    private static androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor getMemoryAccessor() {
            sun.misc.Unsafe r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.UNSAFE
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = androidx.datastore.preferences.protobuf.Android.isOnAndroidDevice()
            if (r2 == 0) goto L20
            boolean r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.IS_ANDROID_64
            if (r2 == 0) goto L16
            androidx.datastore.preferences.protobuf.UnsafeUtil$Android64MemoryAccessor r1 = new androidx.datastore.preferences.protobuf.UnsafeUtil$Android64MemoryAccessor
            r1.<init>(r0)
            return r1
        L16:
            boolean r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.IS_ANDROID_32
            if (r2 == 0) goto L1f
            androidx.datastore.preferences.protobuf.UnsafeUtil$Android32MemoryAccessor r1 = new androidx.datastore.preferences.protobuf.UnsafeUtil$Android32MemoryAccessor
            r1.<init>(r0)
        L1f:
            return r1
        L20:
            androidx.datastore.preferences.protobuf.UnsafeUtil$JvmMemoryAccessor r1 = new androidx.datastore.preferences.protobuf.UnsafeUtil$JvmMemoryAccessor
            r1.<init>(r0)
            return r1
    }

    static java.lang.Object getObject(java.lang.Object r1, long r2) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            java.lang.Object r1 = r0.getObject(r1, r2)
            return r1
    }

    static sun.misc.Unsafe getUnsafe() {
            androidx.datastore.preferences.protobuf.UnsafeUtil$1 r0 = new androidx.datastore.preferences.protobuf.UnsafeUtil$1     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.lang.Throwable -> Lc
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.Throwable -> Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    static boolean hasUnsafeArrayOperations() {
            boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS
            return r0
    }

    static boolean hasUnsafeByteBufferOperations() {
            boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.HAS_UNSAFE_BYTEBUFFER_OPERATIONS
            return r0
    }

    static void putBoolean(java.lang.Object r1, long r2, boolean r4) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r0.putBoolean(r1, r2, r4)
            return
    }

    private static void putBooleanBigEndian(java.lang.Object r0, long r1, boolean r3) {
            byte r3 = (byte) r3
            putByteBigEndian(r0, r1, r3)
            return
    }

    private static void putBooleanLittleEndian(java.lang.Object r0, long r1, boolean r3) {
            byte r3 = (byte) r3
            putByteLittleEndian(r0, r1, r3)
            return
    }

    static void putByte(byte[] r3, long r4, byte r6) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            long r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET
            long r1 = r1 + r4
            r0.putByte(r3, r1, r6)
            return
    }

    private static void putByteBigEndian(java.lang.Object r4, long r5, byte r7) {
            r0 = -4
            long r0 = r0 & r5
            int r2 = getInt(r4, r0)
            int r6 = (int) r5
            int r5 = ~r6
            r5 = r5 & 3
            int r5 = r5 << 3
            r6 = 255(0xff, float:3.57E-43)
            int r3 = r6 << r5
            int r3 = ~r3
            r2 = r2 & r3
            r6 = r6 & r7
            int r5 = r6 << r5
            r5 = r5 | r2
            putInt(r4, r0, r5)
            return
    }

    private static void putByteLittleEndian(java.lang.Object r4, long r5, byte r7) {
            r0 = -4
            long r0 = r0 & r5
            int r2 = getInt(r4, r0)
            int r6 = (int) r5
            r5 = r6 & 3
            int r5 = r5 << 3
            r6 = 255(0xff, float:3.57E-43)
            int r3 = r6 << r5
            int r3 = ~r3
            r2 = r2 & r3
            r6 = r6 & r7
            int r5 = r6 << r5
            r5 = r5 | r2
            putInt(r4, r0, r5)
            return
    }

    static void putDouble(java.lang.Object r6, long r7, double r9) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r1 = r6
            r2 = r7
            r4 = r9
            r0.putDouble(r1, r2, r4)
            return
    }

    static void putFloat(java.lang.Object r1, long r2, float r4) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r0.putFloat(r1, r2, r4)
            return
    }

    static void putInt(java.lang.Object r1, long r2, int r4) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r0.putInt(r1, r2, r4)
            return
    }

    static void putLong(java.lang.Object r6, long r7, long r9) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r1 = r6
            r2 = r7
            r4 = r9
            r0.putLong(r1, r2, r4)
            return
    }

    static void putObject(java.lang.Object r1, long r2, java.lang.Object r4) {
            androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.MEMORY_ACCESSOR
            r0.putObject(r1, r2, r4)
            return
    }

    private static boolean supportsUnsafeArrayOperations() {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            sun.misc.Unsafe r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.UNSAFE
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "objectFieldOffset"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> Lec
            java.lang.Class<java.lang.reflect.Field> r6 = java.lang.reflect.Field.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r5)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "arrayBaseOffset"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> Lec
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r5)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "arrayIndexScale"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> Lec
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r5)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "getInt"
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Lec
            r6[r2] = r0     // Catch: java.lang.Throwable -> Lec
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> Lec
            r6[r4] = r7     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "putInt"
            r6 = 3
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lec
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lec
            r8[r4] = r7     // Catch: java.lang.Throwable -> Lec
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lec
            r8[r5] = r9     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "getLong"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Lec
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lec
            r8[r4] = r7     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "putLong"
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lec
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lec
            r8[r4] = r7     // Catch: java.lang.Throwable -> Lec
            r8[r5] = r7     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "getObject"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Lec
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lec
            r8[r4] = r7     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "putObject"
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lec
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lec
            r8[r4] = r7     // Catch: java.lang.Throwable -> Lec
            r8[r5] = r0     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> Lec
            boolean r3 = androidx.datastore.preferences.protobuf.Android.isOnAndroidDevice()     // Catch: java.lang.Throwable -> Lec
            if (r3 == 0) goto L83
            return r4
        L83:
            java.lang.String r3 = "getByte"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Lec
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lec
            r8[r4] = r7     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "putByte"
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lec
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lec
            r8[r4] = r7     // Catch: java.lang.Throwable -> Lec
            java.lang.Class r9 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> Lec
            r8[r5] = r9     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "getBoolean"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Lec
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lec
            r8[r4] = r7     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "putBoolean"
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lec
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lec
            r8[r4] = r7     // Catch: java.lang.Throwable -> Lec
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lec
            r8[r5] = r9     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "getFloat"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Lec
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lec
            r8[r4] = r7     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "putFloat"
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lec
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lec
            r8[r4] = r7     // Catch: java.lang.Throwable -> Lec
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> Lec
            r8[r5] = r9     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "getDouble"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> Lec
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lec
            r8[r4] = r7     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r8)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "putDouble"
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lec
            r6[r2] = r0     // Catch: java.lang.Throwable -> Lec
            r6[r4] = r7     // Catch: java.lang.Throwable -> Lec
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch: java.lang.Throwable -> Lec
            r6[r5] = r0     // Catch: java.lang.Throwable -> Lec
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> Lec
            return r4
        Lec:
            r0 = move-exception
            java.util.logging.Logger r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.logger
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "platform method missing - proto runtime falling back to safer methods: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.log(r3, r0)
            return r2
    }

    private static boolean supportsUnsafeByteBufferOperations() {
            java.lang.String r0 = "copyMemory"
            java.lang.String r1 = "getLong"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            sun.misc.Unsafe r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.UNSAFE
            r4 = 0
            if (r3 != 0) goto Lc
            return r4
        Lc:
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L92
            java.lang.String r5 = "objectFieldOffset"
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L92
            java.lang.Class<java.lang.reflect.Field> r8 = java.lang.reflect.Field.class
            r7[r4] = r8     // Catch: java.lang.Throwable -> L92
            r3.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L92
            r5 = 2
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L92
            r7[r4] = r2     // Catch: java.lang.Throwable -> L92
            java.lang.Class r8 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L92
            r7[r6] = r8     // Catch: java.lang.Throwable -> L92
            r3.getMethod(r1, r7)     // Catch: java.lang.Throwable -> L92
            java.lang.reflect.Field r7 = bufferAddressField()     // Catch: java.lang.Throwable -> L92
            if (r7 != 0) goto L2f
            return r4
        L2f:
            boolean r7 = androidx.datastore.preferences.protobuf.Android.isOnAndroidDevice()     // Catch: java.lang.Throwable -> L92
            if (r7 == 0) goto L36
            return r6
        L36:
            java.lang.String r7 = "getByte"
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L92
            r9[r4] = r8     // Catch: java.lang.Throwable -> L92
            r3.getMethod(r7, r9)     // Catch: java.lang.Throwable -> L92
            java.lang.String r7 = "putByte"
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L92
            r9[r4] = r8     // Catch: java.lang.Throwable -> L92
            java.lang.Class r10 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L92
            r9[r6] = r10     // Catch: java.lang.Throwable -> L92
            r3.getMethod(r7, r9)     // Catch: java.lang.Throwable -> L92
            java.lang.String r7 = "getInt"
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L92
            r9[r4] = r8     // Catch: java.lang.Throwable -> L92
            r3.getMethod(r7, r9)     // Catch: java.lang.Throwable -> L92
            java.lang.String r7 = "putInt"
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L92
            r9[r4] = r8     // Catch: java.lang.Throwable -> L92
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L92
            r9[r6] = r10     // Catch: java.lang.Throwable -> L92
            r3.getMethod(r7, r9)     // Catch: java.lang.Throwable -> L92
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L92
            r7[r4] = r8     // Catch: java.lang.Throwable -> L92
            r3.getMethod(r1, r7)     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = "putLong"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L92
            r7[r4] = r8     // Catch: java.lang.Throwable -> L92
            r7[r6] = r8     // Catch: java.lang.Throwable -> L92
            r3.getMethod(r1, r7)     // Catch: java.lang.Throwable -> L92
            r1 = 3
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L92
            r7[r4] = r8     // Catch: java.lang.Throwable -> L92
            r7[r6] = r8     // Catch: java.lang.Throwable -> L92
            r7[r5] = r8     // Catch: java.lang.Throwable -> L92
            r3.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L92
            r7 = 5
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L92
            r7[r4] = r2     // Catch: java.lang.Throwable -> L92
            r7[r6] = r8     // Catch: java.lang.Throwable -> L92
            r7[r5] = r2     // Catch: java.lang.Throwable -> L92
            r7[r1] = r8     // Catch: java.lang.Throwable -> L92
            r1 = 4
            r7[r1] = r8     // Catch: java.lang.Throwable -> L92
            r3.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L92
            return r6
        L92:
            r0 = move-exception
            java.util.logging.Logger r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.logger
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "platform method missing - proto runtime falling back to safer methods: "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.log(r2, r0)
            return r4
    }
}
