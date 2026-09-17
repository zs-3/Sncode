package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzit;
import com.google.android.gms.internal.drive.zziu;

/* loaded from: classes.dex */
public abstract class zzit<MessageType extends com.google.android.gms.internal.drive.zzit<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.drive.zziu<MessageType, BuilderType>> implements com.google.android.gms.internal.drive.zzlq {
    private static boolean zznf;
    protected int zzne;

    static {
            return
    }

    public zzit() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzne = r0
            return
    }

    public final byte[] toByteArray() {
            r6 = this;
            int r0 = r6.zzcx()     // Catch: java.io.IOException -> L11
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L11
            com.google.android.gms.internal.drive.zzjr r1 = com.google.android.gms.internal.drive.zzjr.zzb(r0)     // Catch: java.io.IOException -> L11
            r6.zzb(r1)     // Catch: java.io.IOException -> L11
            r1.zzcb()     // Catch: java.io.IOException -> L11
            return r0
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "byte array"
            java.lang.Class r3 = r6.getClass()
            java.lang.String r3 = r3.getName()
            int r4 = r3.length()
            int r4 = r4 + 62
            int r5 = r2.length()
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Serializing "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = " to a "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = " threw an IOException (should never happen)."
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.drive.zzlq
    public final com.google.android.gms.internal.drive.zzjc zzbl() {
            r6 = this;
            int r0 = r6.zzcx()     // Catch: java.io.IOException -> L14
            com.google.android.gms.internal.drive.zzjk r0 = com.google.android.gms.internal.drive.zzjc.zzu(r0)     // Catch: java.io.IOException -> L14
            com.google.android.gms.internal.drive.zzjr r1 = r0.zzby()     // Catch: java.io.IOException -> L14
            r6.zzb(r1)     // Catch: java.io.IOException -> L14
            com.google.android.gms.internal.drive.zzjc r0 = r0.zzbx()     // Catch: java.io.IOException -> L14
            return r0
        L14:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "ByteString"
            java.lang.Class r3 = r6.getClass()
            java.lang.String r3 = r3.getName()
            int r4 = r3.length()
            int r4 = r4 + 62
            int r5 = r2.length()
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Serializing "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = " to a "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = " threw an IOException (should never happen)."
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    int zzbm() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    void zzo(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
