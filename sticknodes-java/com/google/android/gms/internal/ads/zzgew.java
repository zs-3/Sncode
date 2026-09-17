package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgew extends com.google.android.gms.internal.ads.zzgey {
    zzgew(com.google.android.gms.internal.ads.zzgas r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzv()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgey
    public final /* bridge */ /* synthetic */ java.lang.Object zzG(java.util.List r3) {
            r2 = this;
            int r0 = r3.size()
            java.util.ArrayList r0 = com.google.android.gms.internal.ads.zzgbn.zza(r0)
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r3.next()
            com.google.android.gms.internal.ads.zzgex r1 = (com.google.android.gms.internal.ads.zzgex) r1
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r1.zza
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0.add(r1)
            goto Lc
        L22:
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            return r3
    }
}
