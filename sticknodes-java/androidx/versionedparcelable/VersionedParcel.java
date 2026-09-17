package androidx.versionedparcelable;

/* loaded from: classes.dex */
public abstract class VersionedParcel {
    protected final androidx.collection.ArrayMap<java.lang.String, java.lang.Class> mParcelizerCache;
    protected final androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> mReadCache;
    protected final androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> mWriteCache;

    public VersionedParcel(androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r1, androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r2, androidx.collection.ArrayMap<java.lang.String, java.lang.Class> r3) {
            r0 = this;
            r0.<init>()
            r0.mReadCache = r1
            r0.mWriteCache = r2
            r0.mParcelizerCache = r3
            return
    }

    private java.lang.Class findParcelClass(java.lang.Class<? extends androidx.versionedparcelable.VersionedParcelable> r5) throws java.lang.ClassNotFoundException {
            r4 = this;
            androidx.collection.ArrayMap<java.lang.String, java.lang.Class> r0 = r4.mParcelizerCache
            java.lang.String r1 = r5.getName()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L3a
            java.lang.Package r0 = r5.getPackage()
            java.lang.String r0 = r0.getName()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            java.lang.String r3 = r5.getSimpleName()
            r1[r0] = r3
            java.lang.String r0 = "%s.%sParcelizer"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.ClassLoader r1 = r5.getClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r0, r2, r1)
            androidx.collection.ArrayMap<java.lang.String, java.lang.Class> r1 = r4.mParcelizerCache
            java.lang.String r5 = r5.getName()
            r1.put(r5, r0)
        L3a:
            return r0
    }

    private java.lang.reflect.Method getReadMethod(java.lang.String r5) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
            r4 = this;
            java.lang.Class<androidx.versionedparcelable.VersionedParcel> r0 = androidx.versionedparcelable.VersionedParcel.class
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r1 = r4.mReadCache
            java.lang.Object r1 = r1.get(r5)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto L28
            java.lang.System.currentTimeMillis()
            java.lang.ClassLoader r1 = r0.getClassLoader()
            r2 = 1
            java.lang.Class r1 = java.lang.Class.forName(r5, r2, r1)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "read"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r0, r2)
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r0 = r4.mReadCache
            r0.put(r5, r1)
        L28:
            return r1
    }

    private java.lang.reflect.Method getWriteMethod(java.lang.Class r5) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
            r4 = this;
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r0 = r4.mWriteCache
            java.lang.String r1 = r5.getName()
            java.lang.Object r0 = r0.get(r1)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L2f
            java.lang.Class r0 = r4.findParcelClass(r5)
            java.lang.System.currentTimeMillis()
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r1[r2] = r5
            r2 = 1
            java.lang.Class<androidx.versionedparcelable.VersionedParcel> r3 = androidx.versionedparcelable.VersionedParcel.class
            r1[r2] = r3
            java.lang.String r2 = "write"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> r1 = r4.mWriteCache
            java.lang.String r5 = r5.getName()
            r1.put(r5, r0)
        L2f:
            return r0
    }

    private void writeVersionedParcelableCreator(androidx.versionedparcelable.VersionedParcelable r4) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L10
            java.lang.Class r4 = r3.findParcelClass(r0)     // Catch: java.lang.ClassNotFoundException -> L10
            java.lang.String r4 = r4.getName()
            r3.writeString(r4)
            return
        L10:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            java.lang.String r4 = " does not have a Parcelizer"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    protected abstract void closeField();

    protected abstract androidx.versionedparcelable.VersionedParcel createSubParcel();

    public boolean isStream() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected abstract boolean readBoolean();

    public boolean readBoolean(boolean r1, int r2) {
            r0 = this;
            boolean r2 = r0.readField(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            boolean r1 = r0.readBoolean()
            return r1
    }

    protected abstract byte[] readByteArray();

    public byte[] readByteArray(byte[] r1, int r2) {
            r0 = this;
            boolean r2 = r0.readField(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            byte[] r1 = r0.readByteArray()
            return r1
    }

    protected abstract java.lang.CharSequence readCharSequence();

    public java.lang.CharSequence readCharSequence(java.lang.CharSequence r1, int r2) {
            r0 = this;
            boolean r2 = r0.readField(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            java.lang.CharSequence r1 = r0.readCharSequence()
            return r1
    }

    protected abstract boolean readField(int r1);

    protected <T extends androidx.versionedparcelable.VersionedParcelable> T readFromParcel(java.lang.String r4, androidx.versionedparcelable.VersionedParcel r5) {
            r3 = this;
            java.lang.reflect.Method r4 = r3.getReadMethod(r4)     // Catch: java.lang.ClassNotFoundException -> L12 java.lang.NoSuchMethodException -> L1b java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L3c
            r0 = 0
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.ClassNotFoundException -> L12 java.lang.NoSuchMethodException -> L1b java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L3c
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.ClassNotFoundException -> L12 java.lang.NoSuchMethodException -> L1b java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L3c
            java.lang.Object r4 = r4.invoke(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L12 java.lang.NoSuchMethodException -> L1b java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L3c
            androidx.versionedparcelable.VersionedParcelable r4 = (androidx.versionedparcelable.VersionedParcelable) r4     // Catch: java.lang.ClassNotFoundException -> L12 java.lang.NoSuchMethodException -> L1b java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L3c
            return r4
        L12:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered ClassNotFoundException"
            r5.<init>(r0, r4)
            throw r5
        L1b:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered NoSuchMethodException"
            r5.<init>(r0, r4)
            throw r5
        L24:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            boolean r5 = r5 instanceof java.lang.RuntimeException
            if (r5 == 0) goto L34
            java.lang.Throwable r4 = r4.getCause()
            java.lang.RuntimeException r4 = (java.lang.RuntimeException) r4
            throw r4
        L34:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered InvocationTargetException"
            r5.<init>(r0, r4)
            throw r5
        L3c:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered IllegalAccessException"
            r5.<init>(r0, r4)
            throw r5
    }

    protected abstract int readInt();

    public int readInt(int r1, int r2) {
            r0 = this;
            boolean r2 = r0.readField(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            int r1 = r0.readInt()
            return r1
    }

    protected abstract <T extends android.os.Parcelable> T readParcelable();

    public <T extends android.os.Parcelable> T readParcelable(T r1, int r2) {
            r0 = this;
            boolean r2 = r0.readField(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            android.os.Parcelable r1 = r0.readParcelable()
            return r1
    }

    protected abstract java.lang.String readString();

    public java.lang.String readString(java.lang.String r1, int r2) {
            r0 = this;
            boolean r2 = r0.readField(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            java.lang.String r1 = r0.readString()
            return r1
    }

    protected <T extends androidx.versionedparcelable.VersionedParcelable> T readVersionedParcelable() {
            r2 = this;
            java.lang.String r0 = r2.readString()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            androidx.versionedparcelable.VersionedParcel r1 = r2.createSubParcel()
            androidx.versionedparcelable.VersionedParcelable r0 = r2.readFromParcel(r0, r1)
            return r0
    }

    public <T extends androidx.versionedparcelable.VersionedParcelable> T readVersionedParcelable(T r1, int r2) {
            r0 = this;
            boolean r2 = r0.readField(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            androidx.versionedparcelable.VersionedParcelable r1 = r0.readVersionedParcelable()
            return r1
    }

    protected abstract void setOutputField(int r1);

    public void setSerializationFlags(boolean r1, boolean r2) {
            r0 = this;
            return
    }

    protected abstract void writeBoolean(boolean r1);

    public void writeBoolean(boolean r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeBoolean(r1)
            return
    }

    protected abstract void writeByteArray(byte[] r1);

    public void writeByteArray(byte[] r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeByteArray(r1)
            return
    }

    protected abstract void writeCharSequence(java.lang.CharSequence r1);

    public void writeCharSequence(java.lang.CharSequence r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeCharSequence(r1)
            return
    }

    protected abstract void writeInt(int r1);

    public void writeInt(int r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeInt(r1)
            return
    }

    protected abstract void writeParcelable(android.os.Parcelable r1);

    public void writeParcelable(android.os.Parcelable r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeParcelable(r1)
            return
    }

    protected abstract void writeString(java.lang.String r1);

    public void writeString(java.lang.String r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeString(r1)
            return
    }

    protected <T extends androidx.versionedparcelable.VersionedParcelable> void writeToParcel(T r5, androidx.versionedparcelable.VersionedParcel r6) {
            r4 = this;
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.ClassNotFoundException -> L16 java.lang.NoSuchMethodException -> L1f java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L40
            java.lang.reflect.Method r0 = r4.getWriteMethod(r0)     // Catch: java.lang.ClassNotFoundException -> L16 java.lang.NoSuchMethodException -> L1f java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L40
            r1 = 0
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ClassNotFoundException -> L16 java.lang.NoSuchMethodException -> L1f java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L40
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.ClassNotFoundException -> L16 java.lang.NoSuchMethodException -> L1f java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L40
            r5 = 1
            r2[r5] = r6     // Catch: java.lang.ClassNotFoundException -> L16 java.lang.NoSuchMethodException -> L1f java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L40
            r0.invoke(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L16 java.lang.NoSuchMethodException -> L1f java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L40
            return
        L16:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered ClassNotFoundException"
            r6.<init>(r0, r5)
            throw r6
        L1f:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered NoSuchMethodException"
            r6.<init>(r0, r5)
            throw r6
        L28:
            r5 = move-exception
            java.lang.Throwable r6 = r5.getCause()
            boolean r6 = r6 instanceof java.lang.RuntimeException
            if (r6 == 0) goto L38
            java.lang.Throwable r5 = r5.getCause()
            java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5
            throw r5
        L38:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered InvocationTargetException"
            r6.<init>(r0, r5)
            throw r6
        L40:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "VersionedParcel encountered IllegalAccessException"
            r6.<init>(r0, r5)
            throw r6
    }

    protected void writeVersionedParcelable(androidx.versionedparcelable.VersionedParcelable r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            r1.writeString(r2)
            return
        L7:
            r1.writeVersionedParcelableCreator(r2)
            androidx.versionedparcelable.VersionedParcel r0 = r1.createSubParcel()
            r1.writeToParcel(r2, r0)
            r0.closeField()
            return
    }

    public void writeVersionedParcelable(androidx.versionedparcelable.VersionedParcelable r1, int r2) {
            r0 = this;
            r0.setOutputField(r2)
            r0.writeVersionedParcelable(r1)
            return
    }
}
