package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzfh extends com.google.android.gms.internal.auth.zzfl {
    private static final java.lang.Class zza = null;

    static {
            java.util.List r0 = java.util.Collections.emptyList()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Class r0 = r0.getClass()
            com.google.android.gms.internal.auth.zzfh.zza = r0
            return
    }

    private zzfh() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    /* synthetic */ zzfh(com.google.android.gms.internal.auth.zzfg r1) {
            r0 = this;
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zza(java.lang.Object r4, long r5) {
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.internal.auth.zzhj.zzf(r4, r5)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0 instanceof com.google.android.gms.internal.auth.zzff
            if (r1 == 0) goto L11
            com.google.android.gms.internal.auth.zzff r0 = (com.google.android.gms.internal.auth.zzff) r0
            com.google.android.gms.internal.auth.zzff r0 = r0.zze()
            goto L36
        L11:
            java.lang.Class r1 = com.google.android.gms.internal.auth.zzfh.zza
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L1e
            return
        L1e:
            boolean r1 = r0 instanceof com.google.android.gms.internal.auth.zzge
            if (r1 == 0) goto L32
            boolean r1 = r0 instanceof com.google.android.gms.internal.auth.zzez
            if (r1 == 0) goto L32
            com.google.android.gms.internal.auth.zzez r0 = (com.google.android.gms.internal.auth.zzez) r0
            boolean r4 = r0.zzc()
            if (r4 == 0) goto L31
            r0.zzb()
        L31:
            return
        L32:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L36:
            com.google.android.gms.internal.auth.zzhj.zzp(r4, r5, r0)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zzb(java.lang.Object r5, java.lang.Object r6, long r7) {
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.auth.zzhj.zzf(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhj.zzf(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L39
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.zzff
            if (r2 == 0) goto L20
            com.google.android.gms.internal.auth.zzfe r1 = new com.google.android.gms.internal.auth.zzfe
            r1.<init>(r0)
            goto L35
        L20:
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.zzge
            if (r2 == 0) goto L30
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.zzez
            if (r2 == 0) goto L30
            com.google.android.gms.internal.auth.zzez r1 = (com.google.android.gms.internal.auth.zzez) r1
            com.google.android.gms.internal.auth.zzez r0 = r1.zzd(r0)
            r1 = r0
            goto L35
        L30:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L35:
            com.google.android.gms.internal.auth.zzhj.zzp(r5, r7, r1)
            goto L8f
        L39:
            java.lang.Class r2 = com.google.android.gms.internal.auth.zzfh.zza
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L57
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.auth.zzhj.zzp(r5, r7, r2)
        L55:
            r1 = r2
            goto L8f
        L57:
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.zzhe
            if (r2 == 0) goto L72
            com.google.android.gms.internal.auth.zzfe r2 = new com.google.android.gms.internal.auth.zzfe
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            com.google.android.gms.internal.auth.zzhe r1 = (com.google.android.gms.internal.auth.zzhe) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            com.google.android.gms.internal.auth.zzhj.zzp(r5, r7, r2)
            goto L55
        L72:
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.zzge
            if (r2 == 0) goto L8f
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.zzez
            if (r2 == 0) goto L8f
            r2 = r1
            com.google.android.gms.internal.auth.zzez r2 = (com.google.android.gms.internal.auth.zzez) r2
            boolean r3 = r2.zzc()
            if (r3 != 0) goto L8f
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.auth.zzez r1 = r2.zzd(r1)
            com.google.android.gms.internal.auth.zzhj.zzp(r5, r7, r1)
        L8f:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L9e
            if (r2 <= 0) goto L9e
            r1.addAll(r6)
        L9e:
            if (r0 > 0) goto La1
            goto La2
        La1:
            r6 = r1
        La2:
            com.google.android.gms.internal.auth.zzhj.zzp(r5, r7, r6)
            return
    }
}
