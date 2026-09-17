package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public class SerializationUtils {

    static class ClassLoaderAwareObjectInputStream extends java.io.ObjectInputStream {
        private static final java.util.Map<java.lang.String, java.lang.Class<?>> primitiveTypes = null;
        private final java.lang.ClassLoader classLoader;

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream.primitiveTypes = r0
                java.lang.Class r1 = java.lang.Byte.TYPE
                java.lang.String r2 = "byte"
                r0.put(r2, r1)
                java.lang.Class r1 = java.lang.Short.TYPE
                java.lang.String r2 = "short"
                r0.put(r2, r1)
                java.lang.Class r1 = java.lang.Integer.TYPE
                java.lang.String r2 = "int"
                r0.put(r2, r1)
                java.lang.Class r1 = java.lang.Long.TYPE
                java.lang.String r2 = "long"
                r0.put(r2, r1)
                java.lang.Class r1 = java.lang.Float.TYPE
                java.lang.String r2 = "float"
                r0.put(r2, r1)
                java.lang.Class r1 = java.lang.Double.TYPE
                java.lang.String r2 = "double"
                r0.put(r2, r1)
                java.lang.Class r1 = java.lang.Boolean.TYPE
                java.lang.String r2 = "boolean"
                r0.put(r2, r1)
                java.lang.Class r1 = java.lang.Character.TYPE
                java.lang.String r2 = "char"
                r0.put(r2, r1)
                java.lang.Class r1 = java.lang.Void.TYPE
                java.lang.String r2 = "void"
                r0.put(r2, r1)
                return
        }

        ClassLoaderAwareObjectInputStream(java.io.InputStream r1, java.lang.ClassLoader r2) throws java.io.IOException {
                r0 = this;
                r0.<init>(r1)
                r0.classLoader = r2
                return
        }

        @Override // java.io.ObjectInputStream
        protected java.lang.Class<?> resolveClass(java.io.ObjectStreamClass r3) throws java.io.IOException, java.lang.ClassNotFoundException {
                r2 = this;
                java.lang.String r3 = r3.getName()
                r0 = 0
                java.lang.ClassLoader r1 = r2.classLoader     // Catch: java.lang.ClassNotFoundException -> Lc
                java.lang.Class r3 = java.lang.Class.forName(r3, r0, r1)     // Catch: java.lang.ClassNotFoundException -> Lc
                return r3
            Lc:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.ClassNotFoundException -> L19
                java.lang.ClassLoader r1 = r1.getContextClassLoader()     // Catch: java.lang.ClassNotFoundException -> L19
                java.lang.Class r3 = java.lang.Class.forName(r3, r0, r1)     // Catch: java.lang.ClassNotFoundException -> L19
                return r3
            L19:
                r0 = move-exception
                java.util.Map<java.lang.String, java.lang.Class<?>> r1 = org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream.primitiveTypes
                java.lang.Object r3 = r1.get(r3)
                java.lang.Class r3 = (java.lang.Class) r3
                if (r3 == 0) goto L25
                return r3
            L25:
                throw r0
        }
    }

    public SerializationUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends java.io.Serializable> T clone(T r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            byte[] r0 = serialize(r2)
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r0)
            org.apache.commons.lang3.SerializationUtils$ClassLoaderAwareObjectInputStream r0 = new org.apache.commons.lang3.SerializationUtils$ClassLoaderAwareObjectInputStream     // Catch: java.io.IOException -> L2e java.lang.ClassNotFoundException -> L37
            java.lang.Class r2 = r2.getClass()     // Catch: java.io.IOException -> L2e java.lang.ClassNotFoundException -> L37
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.io.IOException -> L2e java.lang.ClassNotFoundException -> L37
            r0.<init>(r1, r2)     // Catch: java.io.IOException -> L2e java.lang.ClassNotFoundException -> L37
            java.lang.Object r2 = r0.readObject()     // Catch: java.lang.Throwable -> L24
            java.io.Serializable r2 = (java.io.Serializable) r2     // Catch: java.lang.Throwable -> L24
            r0.close()     // Catch: java.io.IOException -> L2e java.lang.ClassNotFoundException -> L37
            return r2
        L24:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.io.IOException -> L2e java.lang.ClassNotFoundException -> L37
        L2d:
            throw r2     // Catch: java.io.IOException -> L2e java.lang.ClassNotFoundException -> L37
        L2e:
            r2 = move-exception
            org.apache.commons.lang3.SerializationException r0 = new org.apache.commons.lang3.SerializationException
            java.lang.String r1 = "IOException while reading or closing cloned object data"
            r0.<init>(r1, r2)
            throw r0
        L37:
            r2 = move-exception
            org.apache.commons.lang3.SerializationException r0 = new org.apache.commons.lang3.SerializationException
            java.lang.String r1 = "ClassNotFoundException while reading cloned object data"
            r0.<init>(r1, r2)
            throw r0
    }

    public static <T> T deserialize(java.io.InputStream r3) {
            r0 = 0
            if (r3 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "The InputStream must not be null"
            org.apache.commons.lang3.Validate.isTrue(r1, r2, r0)
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch: java.io.IOException -> L24 java.lang.ClassNotFoundException -> L26
            r0.<init>(r3)     // Catch: java.io.IOException -> L24 java.lang.ClassNotFoundException -> L26
            java.lang.Object r3 = r0.readObject()     // Catch: java.lang.Throwable -> L1a
            r0.close()     // Catch: java.io.IOException -> L24 java.lang.ClassNotFoundException -> L26
            return r3
        L1a:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.io.IOException -> L24 java.lang.ClassNotFoundException -> L26
        L23:
            throw r3     // Catch: java.io.IOException -> L24 java.lang.ClassNotFoundException -> L26
        L24:
            r3 = move-exception
            goto L27
        L26:
            r3 = move-exception
        L27:
            org.apache.commons.lang3.SerializationException r0 = new org.apache.commons.lang3.SerializationException
            r0.<init>(r3)
            throw r0
    }

    public static <T> T deserialize(byte[] r3) {
            r0 = 0
            if (r3 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "The byte[] must not be null"
            org.apache.commons.lang3.Validate.isTrue(r1, r2, r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r3)
            java.lang.Object r3 = deserialize(r0)
            return r3
    }

    public static <T extends java.io.Serializable> T roundtrip(T r0) {
            byte[] r0 = serialize(r0)
            java.lang.Object r0 = deserialize(r0)
            java.io.Serializable r0 = (java.io.Serializable) r0
            return r0
    }

    public static void serialize(java.io.Serializable r3, java.io.OutputStream r4) {
            r0 = 0
            if (r4 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "The OutputStream must not be null"
            org.apache.commons.lang3.Validate.isTrue(r1, r2, r0)
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch: java.io.IOException -> L23
            r0.<init>(r4)     // Catch: java.io.IOException -> L23
            r0.writeObject(r3)     // Catch: java.lang.Throwable -> L19
            r0.close()     // Catch: java.io.IOException -> L23
            return
        L19:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch: java.io.IOException -> L23
        L22:
            throw r3     // Catch: java.io.IOException -> L23
        L23:
            r3 = move-exception
            org.apache.commons.lang3.SerializationException r4 = new org.apache.commons.lang3.SerializationException
            r4.<init>(r3)
            throw r4
    }

    public static byte[] serialize(java.io.Serializable r2) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 512(0x200, float:7.175E-43)
            r0.<init>(r1)
            serialize(r2, r0)
            byte[] r2 = r0.toByteArray()
            return r2
    }
}
