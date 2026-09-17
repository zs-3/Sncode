package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgey extends com.google.android.gms.internal.ads.zzgen {
    private java.util.List zza;

    zzgey(com.google.android.gms.internal.ads.zzgas r3, boolean r4) {
            r2 = this;
            r0 = 1
            r2.<init>(r3, r4, r0)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto Lf
            java.util.List r4 = java.util.Collections.emptyList()
            goto L17
        Lf:
            int r4 = r3.size()
            java.util.ArrayList r4 = com.google.android.gms.internal.ads.zzgbn.zza(r4)
        L17:
            r0 = 0
        L18:
            int r1 = r3.size()
            if (r0 >= r1) goto L25
            r1 = 0
            r4.add(r1)
            int r0 = r0 + 1
            goto L18
        L25:
            r2.zza = r4
            return
    }

    abstract java.lang.Object zzG(java.util.List r1);

    @Override // com.google.android.gms.internal.ads.zzgen
    final void zzf(int r3, java.lang.Object r4) {
            r2 = this;
            java.util.List r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzgex r1 = new com.google.android.gms.internal.ads.zzgex
            r1.<init>(r4)
            r0.set(r3, r1)
        Lc:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    final void zzu() {
            r1 = this;
            java.util.List r0 = r1.zza
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r1.zzG(r0)
            r1.zzc(r0)
        Lb:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    final void zzy(int r1) {
            r0 = this;
            super.zzy(r1)
            r1 = 0
            r0.zza = r1
            return
    }
}
