package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzfyc implements java.io.Serializable, com.google.android.gms.internal.ads.zzfya {
    private final java.util.List zza;

    /* synthetic */ zzfyc(java.util.List r1, com.google.android.gms.internal.ads.zzfyb r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzfyc
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzfyc r2 = (com.google.android.gms.internal.ads.zzfyc) r2
            java.util.List r0 = r1.zza
            java.util.List r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.util.List r0 = r2.zza
            int r0 = r0.hashCode()
            r1 = 306654252(0x12472c2c, float:6.2847774E-28)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Predicates."
            r0.<init>(r1)
            java.lang.String r1 = "and("
            r0.append(r1)
            java.util.List r1 = r4.zza
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L13:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r1.next()
            if (r2 != 0) goto L24
            r2 = 44
            r0.append(r2)
        L24:
            r0.append(r3)
            r2 = 0
            goto L13
        L29:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final boolean zza(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.List r2 = r3.zza
            int r2 = r2.size()
            if (r1 >= r2) goto L1c
            java.util.List r2 = r3.zza
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzfya r2 = (com.google.android.gms.internal.ads.zzfya) r2
            boolean r2 = r2.zza(r4)
            if (r2 != 0) goto L19
            return r0
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            r4 = 1
            return r4
    }
}
