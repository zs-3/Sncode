package com.google.android.vending.licensing;

/* loaded from: classes2.dex */
public class PreferenceObfuscator {
    private static final java.lang.String TAG = "PreferenceObfuscator";
    private android.content.SharedPreferences.Editor mEditor;
    private final com.google.android.vending.licensing.Obfuscator mObfuscator;
    private final android.content.SharedPreferences mPreferences;

    public PreferenceObfuscator(android.content.SharedPreferences r1, com.google.android.vending.licensing.Obfuscator r2) {
            r0 = this;
            r0.<init>()
            r0.mPreferences = r1
            r0.mObfuscator = r2
            r1 = 0
            r0.mEditor = r1
            return
    }

    public void commit() {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.mEditor
            if (r0 == 0) goto La
            r0.commit()
            r0 = 0
            r1.mEditor = r0
        La:
            return
    }

    public java.lang.String getString(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.mPreferences
            r1 = 0
            java.lang.String r0 = r0.getString(r3, r1)
            if (r0 == 0) goto L26
            com.google.android.vending.licensing.Obfuscator r1 = r2.mObfuscator     // Catch: com.google.android.vending.licensing.ValidationException -> L10
            java.lang.String r4 = r1.unobfuscate(r0, r3)     // Catch: com.google.android.vending.licensing.ValidationException -> L10
            goto L26
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Validation error while reading preference: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "PreferenceObfuscator"
            android.util.Log.w(r0, r3)
        L26:
            return r4
    }

    public void putString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.mEditor
            if (r0 != 0) goto Lc
            android.content.SharedPreferences r0 = r1.mPreferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1.mEditor = r0
        Lc:
            com.google.android.vending.licensing.Obfuscator r0 = r1.mObfuscator
            java.lang.String r3 = r0.obfuscate(r3, r2)
            android.content.SharedPreferences$Editor r0 = r1.mEditor
            r0.putString(r2, r3)
            return
    }
}
