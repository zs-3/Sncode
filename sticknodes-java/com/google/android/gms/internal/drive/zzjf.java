package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
abstract class zzjf implements com.google.android.gms.internal.drive.zzjj {
    zzjf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public /* synthetic */ java.lang.Byte next() {
            r1 = this;
            byte r0 = r1.nextByte()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
