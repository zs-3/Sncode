package com.google.android.vending.licensing;

/* loaded from: classes2.dex */
public interface Obfuscator {
    java.lang.String obfuscate(java.lang.String r1, java.lang.String r2);

    java.lang.String unobfuscate(java.lang.String r1, java.lang.String r2) throws com.google.android.vending.licensing.ValidationException;
}
