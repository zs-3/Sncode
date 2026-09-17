package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgza;
import com.google.android.gms.internal.ads.zzgzb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgzb<MessageType extends com.google.android.gms.internal.ads.zzgzb<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzgza<MessageType, BuilderType>> implements com.google.android.gms.internal.ads.zzhcp {
    protected int zzq;

    public zzgzb() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzq = r0
            return
    }

    protected static <T> void zzaQ(java.lang.Iterable<T> r0, java.util.List<? super T> r1) {
            com.google.android.gms.internal.ads.zzgza.zzbd(r0, r1)
            return
    }

    protected static void zzaR(com.google.android.gms.internal.ads.zzgzs r1) throws java.lang.IllegalArgumentException {
            boolean r1 = r1.zzp()
            if (r1 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Byte string is not UTF-8."
            r1.<init>(r0)
            throw r1
    }

    private java.lang.String zzdI(java.lang.String r4) {
            r3 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Serializing "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " to a "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = " threw an IOException (should never happen)."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    int zzaL() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    int zzaM(com.google.android.gms.internal.ads.zzhdk r1) {
            r0 = this;
            int r1 = r0.zzaL()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    public com.google.android.gms.internal.ads.zzgzs zzaN() {
            r4 = this;
            int r0 = r4.zzaY()     // Catch: java.io.IOException -> L1a
            com.google.android.gms.internal.ads.zzgzs r1 = com.google.android.gms.internal.ads.zzgzs.zzb     // Catch: java.io.IOException -> L1a
            byte[] r1 = new byte[r0]     // Catch: java.io.IOException -> L1a
            com.google.android.gms.internal.ads.zzhaf r2 = new com.google.android.gms.internal.ads.zzhaf     // Catch: java.io.IOException -> L1a
            r3 = 0
            r2.<init>(r1, r3, r0)     // Catch: java.io.IOException -> L1a
            r4.zzda(r2)     // Catch: java.io.IOException -> L1a
            r2.zzF()     // Catch: java.io.IOException -> L1a
            com.google.android.gms.internal.ads.zzgzq r0 = new com.google.android.gms.internal.ads.zzgzq     // Catch: java.io.IOException -> L1a
            r0.<init>(r1)     // Catch: java.io.IOException -> L1a
            return r0
        L1a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "ByteString"
            java.lang.String r2 = r4.zzdI(r2)
            r1.<init>(r2, r0)
            throw r1
    }

    public com.google.android.gms.internal.ads.zzhcu zzaO() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "mutableCopy() is not implemented."
            r0.<init>(r1)
            throw r0
    }

    com.google.android.gms.internal.ads.zzhdx zzaP() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhdx r0 = new com.google.android.gms.internal.ads.zzhdx
            r0.<init>(r1)
            return r0
    }

    void zzaS(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public void zzaT(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzaY()
            int r1 = com.google.android.gms.internal.ads.zzhaj.zzD(r0)
            int r1 = r1 + r0
            com.google.android.gms.internal.ads.zzhah r2 = new com.google.android.gms.internal.ads.zzhah
            int r1 = com.google.android.gms.internal.ads.zzhaj.zzB(r1)
            r2.<init>(r4, r1)
            r2.zzu(r0)
            r3.zzda(r2)
            r2.zzK()
            return
    }

    public void zzaU(java.io.OutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzaY()
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzB(r0)
            com.google.android.gms.internal.ads.zzhah r1 = new com.google.android.gms.internal.ads.zzhah
            r1.<init>(r3, r0)
            r2.zzda(r1)
            r1.zzK()
            return
    }

    public byte[] zzaV() {
            r4 = this;
            int r0 = r4.zzaY()     // Catch: java.io.IOException -> L13
            byte[] r1 = new byte[r0]     // Catch: java.io.IOException -> L13
            com.google.android.gms.internal.ads.zzhaf r2 = new com.google.android.gms.internal.ads.zzhaf     // Catch: java.io.IOException -> L13
            r3 = 0
            r2.<init>(r1, r3, r0)     // Catch: java.io.IOException -> L13
            r4.zzda(r2)     // Catch: java.io.IOException -> L13
            r2.zzF()     // Catch: java.io.IOException -> L13
            return r1
        L13:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "byte array"
            java.lang.String r2 = r4.zzdI(r2)
            r1.<init>(r2, r0)
            throw r1
    }
}
