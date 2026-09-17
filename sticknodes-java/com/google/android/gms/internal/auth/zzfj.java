package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzfj extends com.google.android.gms.internal.auth.zzfl {
    private zzfj() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    /* synthetic */ zzfj(com.google.android.gms.internal.auth.zzfi r1) {
            r0 = this;
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zza(java.lang.Object r1, long r2) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhj.zzf(r1, r2)
            com.google.android.gms.internal.auth.zzez r1 = (com.google.android.gms.internal.auth.zzez) r1
            r1.zzb()
            return
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zzb(java.lang.Object r5, java.lang.Object r6, long r7) {
            r4 = this;
            java.lang.Object r0 = com.google.android.gms.internal.auth.zzhj.zzf(r5, r7)
            com.google.android.gms.internal.auth.zzez r0 = (com.google.android.gms.internal.auth.zzez) r0
            java.lang.Object r6 = com.google.android.gms.internal.auth.zzhj.zzf(r6, r7)
            com.google.android.gms.internal.auth.zzez r6 = (com.google.android.gms.internal.auth.zzez) r6
            int r1 = r0.size()
            int r2 = r6.size()
            if (r1 <= 0) goto L26
            if (r2 <= 0) goto L26
            boolean r3 = r0.zzc()
            if (r3 != 0) goto L23
            int r2 = r2 + r1
            com.google.android.gms.internal.auth.zzez r0 = r0.zzd(r2)
        L23:
            r0.addAll(r6)
        L26:
            if (r1 > 0) goto L29
            goto L2a
        L29:
            r6 = r0
        L2a:
            com.google.android.gms.internal.auth.zzhj.zzp(r5, r7, r6)
            return
    }
}
