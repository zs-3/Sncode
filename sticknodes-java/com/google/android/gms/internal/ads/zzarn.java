package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzarn extends com.google.android.gms.internal.ads.zzhht {
    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzarn> r0 = com.google.android.gms.internal.ads.zzarn.class
            com.google.android.gms.internal.ads.zzhia.zzb(r0)
            return
    }

    public zzarn(com.google.android.gms.internal.ads.zzhhu r3, com.google.android.gms.internal.ads.zzarm r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            long r0 = r3.zzc()
            r2.zze(r3, r0, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhht, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhht
    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.ads.zzhhu r0 = r3.zzc
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "model("
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
