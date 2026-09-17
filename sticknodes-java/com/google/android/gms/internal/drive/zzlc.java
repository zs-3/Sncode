package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzlc extends com.google.android.gms.internal.drive.zzla {
    private static final java.lang.Class<?> zzto = null;

    static {
            java.util.List r0 = java.util.Collections.emptyList()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Class r0 = r0.getClass()
            com.google.android.gms.internal.drive.zzlc.zzto = r0
            return
    }

    private zzlc() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    /* synthetic */ zzlc(com.google.android.gms.internal.drive.zzlb r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private static <E> java.util.List<E> zzb(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.drive.zznd.zzo(r0, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzla
    final void zza(java.lang.Object r4, long r5) {
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.internal.drive.zznd.zzo(r4, r5)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0 instanceof com.google.android.gms.internal.drive.zzkz
            if (r1 == 0) goto L11
            com.google.android.gms.internal.drive.zzkz r0 = (com.google.android.gms.internal.drive.zzkz) r0
            com.google.android.gms.internal.drive.zzkz r0 = r0.zzds()
            goto L36
        L11:
            java.lang.Class<?> r1 = com.google.android.gms.internal.drive.zzlc.zzto
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L1e
            return
        L1e:
            boolean r1 = r0 instanceof com.google.android.gms.internal.drive.zzmc
            if (r1 == 0) goto L32
            boolean r1 = r0 instanceof com.google.android.gms.internal.drive.zzkp
            if (r1 == 0) goto L32
            com.google.android.gms.internal.drive.zzkp r0 = (com.google.android.gms.internal.drive.zzkp) r0
            boolean r4 = r0.zzbo()
            if (r4 == 0) goto L31
            r0.zzbp()
        L31:
            return
        L32:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L36:
            com.google.android.gms.internal.drive.zznd.zza(r4, r5, r0)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzla
    final <E> void zza(java.lang.Object r5, java.lang.Object r6, long r7) {
            r4 = this;
            java.util.List r6 = zzb(r6, r7)
            int r0 = r6.size()
            java.util.List r1 = zzb(r5, r7)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L35
            boolean r2 = r1 instanceof com.google.android.gms.internal.drive.zzkz
            if (r2 == 0) goto L1c
            com.google.android.gms.internal.drive.zzky r1 = new com.google.android.gms.internal.drive.zzky
            r1.<init>(r0)
            goto L31
        L1c:
            boolean r2 = r1 instanceof com.google.android.gms.internal.drive.zzmc
            if (r2 == 0) goto L2c
            boolean r2 = r1 instanceof com.google.android.gms.internal.drive.zzkp
            if (r2 == 0) goto L2c
            com.google.android.gms.internal.drive.zzkp r1 = (com.google.android.gms.internal.drive.zzkp) r1
            com.google.android.gms.internal.drive.zzkp r0 = r1.zzr(r0)
            r1 = r0
            goto L31
        L2c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L31:
            com.google.android.gms.internal.drive.zznd.zza(r5, r7, r1)
            goto L87
        L35:
            java.lang.Class<?> r2 = com.google.android.gms.internal.drive.zzlc.zzto
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L53
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.drive.zznd.zza(r5, r7, r2)
        L51:
            r1 = r2
            goto L87
        L53:
            boolean r2 = r1 instanceof com.google.android.gms.internal.drive.zzna
            if (r2 == 0) goto L6a
            com.google.android.gms.internal.drive.zzky r2 = new com.google.android.gms.internal.drive.zzky
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            com.google.android.gms.internal.drive.zzna r1 = (com.google.android.gms.internal.drive.zzna) r1
            r2.addAll(r1)
            com.google.android.gms.internal.drive.zznd.zza(r5, r7, r2)
            goto L51
        L6a:
            boolean r2 = r1 instanceof com.google.android.gms.internal.drive.zzmc
            if (r2 == 0) goto L87
            boolean r2 = r1 instanceof com.google.android.gms.internal.drive.zzkp
            if (r2 == 0) goto L87
            r2 = r1
            com.google.android.gms.internal.drive.zzkp r2 = (com.google.android.gms.internal.drive.zzkp) r2
            boolean r3 = r2.zzbo()
            if (r3 != 0) goto L87
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.drive.zzkp r1 = r2.zzr(r1)
            com.google.android.gms.internal.drive.zznd.zza(r5, r7, r1)
        L87:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L96
            if (r2 <= 0) goto L96
            r1.addAll(r6)
        L96:
            if (r0 <= 0) goto L99
            r6 = r1
        L99:
            com.google.android.gms.internal.drive.zznd.zza(r5, r7, r6)
            return
    }
}
