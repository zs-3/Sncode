package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzld extends com.google.android.gms.internal.drive.zzla {
    private zzld() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    /* synthetic */ zzld(com.google.android.gms.internal.drive.zzlb r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private static <E> com.google.android.gms.internal.drive.zzkp<E> zzc(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.drive.zznd.zzo(r0, r1)
            com.google.android.gms.internal.drive.zzkp r0 = (com.google.android.gms.internal.drive.zzkp) r0
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzla
    final void zza(java.lang.Object r1, long r2) {
            r0 = this;
            com.google.android.gms.internal.drive.zzkp r1 = zzc(r1, r2)
            r1.zzbp()
            return
    }

    @Override // com.google.android.gms.internal.drive.zzla
    final <E> void zza(java.lang.Object r5, java.lang.Object r6, long r7) {
            r4 = this;
            com.google.android.gms.internal.drive.zzkp r0 = zzc(r5, r7)
            com.google.android.gms.internal.drive.zzkp r6 = zzc(r6, r7)
            int r1 = r0.size()
            int r2 = r6.size()
            if (r1 <= 0) goto L22
            if (r2 <= 0) goto L22
            boolean r3 = r0.zzbo()
            if (r3 != 0) goto L1f
            int r2 = r2 + r1
            com.google.android.gms.internal.drive.zzkp r0 = r0.zzr(r2)
        L1f:
            r0.addAll(r6)
        L22:
            if (r1 <= 0) goto L25
            r6 = r0
        L25:
            com.google.android.gms.internal.drive.zznd.zza(r5, r7, r6)
            return
    }
}
