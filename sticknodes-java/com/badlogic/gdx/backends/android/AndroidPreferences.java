package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidPreferences implements com.badlogic.gdx.Preferences {
    android.content.SharedPreferences.Editor editor;
    android.content.SharedPreferences sharedPrefs;

    public AndroidPreferences(android.content.SharedPreferences r1) {
            r0 = this;
            r0.<init>()
            r0.sharedPrefs = r1
            return
    }

    private void edit() {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.editor
            if (r0 != 0) goto Lc
            android.content.SharedPreferences r0 = r1.sharedPrefs
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1.editor = r0
        Lc:
            return
    }

    public void clear() {
            r1 = this;
            r1.edit()
            android.content.SharedPreferences$Editor r0 = r1.editor
            r0.clear()
            return
    }

    @Override // com.badlogic.gdx.Preferences
    public boolean contains(java.lang.String r2) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.sharedPrefs
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // com.badlogic.gdx.Preferences
    public void flush() {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.editor
            if (r0 == 0) goto La
            r0.apply()
            r0 = 0
            r1.editor = r0
        La:
            return
    }

    public java.util.Map<java.lang.String, ?> get() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.sharedPrefs
            java.util.Map r0 = r0.getAll()
            return r0
    }

    @Override // com.badlogic.gdx.Preferences
    public boolean getBoolean(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.sharedPrefs
            r1 = 0
            boolean r3 = r0.getBoolean(r3, r1)
            return r3
    }

    @Override // com.badlogic.gdx.Preferences
    public boolean getBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.sharedPrefs
            boolean r2 = r0.getBoolean(r2, r3)
            return r2
    }

    public float getFloat(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.sharedPrefs
            r1 = 0
            float r3 = r0.getFloat(r3, r1)
            return r3
    }

    @Override // com.badlogic.gdx.Preferences
    public float getFloat(java.lang.String r2, float r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.sharedPrefs
            float r2 = r0.getFloat(r2, r3)
            return r2
    }

    @Override // com.badlogic.gdx.Preferences
    public int getInteger(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.sharedPrefs
            r1 = 0
            int r3 = r0.getInt(r3, r1)
            return r3
    }

    @Override // com.badlogic.gdx.Preferences
    public int getInteger(java.lang.String r2, int r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.sharedPrefs
            int r2 = r0.getInt(r2, r3)
            return r2
    }

    public long getLong(java.lang.String r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.sharedPrefs
            r1 = 0
            long r0 = r0.getLong(r4, r1)
            return r0
    }

    public long getLong(java.lang.String r2, long r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.sharedPrefs
            long r2 = r0.getLong(r2, r3)
            return r2
    }

    public java.lang.String getString(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.sharedPrefs
            java.lang.String r1 = ""
            java.lang.String r3 = r0.getString(r3, r1)
            return r3
    }

    @Override // com.badlogic.gdx.Preferences
    public java.lang.String getString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.sharedPrefs
            java.lang.String r2 = r0.getString(r2, r3)
            return r2
    }

    public com.badlogic.gdx.Preferences put(java.util.Map<java.lang.String, ?> r5) {
            r4 = this;
            r4.edit()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        Lb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof java.lang.Boolean
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r4.putBoolean(r1, r2)
        L32:
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof java.lang.Integer
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4.putInteger(r1, r2)
        L4d:
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof java.lang.Long
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.getValue()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r4.putLong(r1, r2)
        L68:
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof java.lang.String
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r4.putString(r1, r2)
        L7f:
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof java.lang.Float
            if (r1 == 0) goto Lb
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r4.putFloat(r1, r0)
            goto Lb
        L9c:
            return r4
    }

    @Override // com.badlogic.gdx.Preferences
    public com.badlogic.gdx.Preferences putBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            r1.edit()
            android.content.SharedPreferences$Editor r0 = r1.editor
            r0.putBoolean(r2, r3)
            return r1
    }

    @Override // com.badlogic.gdx.Preferences
    public com.badlogic.gdx.Preferences putFloat(java.lang.String r2, float r3) {
            r1 = this;
            r1.edit()
            android.content.SharedPreferences$Editor r0 = r1.editor
            r0.putFloat(r2, r3)
            return r1
    }

    @Override // com.badlogic.gdx.Preferences
    public com.badlogic.gdx.Preferences putInteger(java.lang.String r2, int r3) {
            r1 = this;
            r1.edit()
            android.content.SharedPreferences$Editor r0 = r1.editor
            r0.putInt(r2, r3)
            return r1
    }

    public com.badlogic.gdx.Preferences putLong(java.lang.String r2, long r3) {
            r1 = this;
            r1.edit()
            android.content.SharedPreferences$Editor r0 = r1.editor
            r0.putLong(r2, r3)
            return r1
    }

    @Override // com.badlogic.gdx.Preferences
    public com.badlogic.gdx.Preferences putString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.edit()
            android.content.SharedPreferences$Editor r0 = r1.editor
            r0.putString(r2, r3)
            return r1
    }

    @Override // com.badlogic.gdx.Preferences
    public void remove(java.lang.String r2) {
            r1 = this;
            r1.edit()
            android.content.SharedPreferences$Editor r0 = r1.editor
            r0.remove(r2)
            return
    }
}
