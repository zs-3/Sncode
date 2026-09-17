package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzdx implements java.util.Comparator {
    zzdx() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            com.google.android.gms.internal.auth.zzef r5 = (com.google.android.gms.internal.auth.zzef) r5
            com.google.android.gms.internal.auth.zzef r6 = (com.google.android.gms.internal.auth.zzef) r6
            com.google.android.gms.internal.auth.zzdw r0 = new com.google.android.gms.internal.auth.zzdw
            r0.<init>(r5)
            com.google.android.gms.internal.auth.zzdw r1 = new com.google.android.gms.internal.auth.zzdw
            r1.<init>(r6)
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L35
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            byte r2 = r0.zza()
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            byte r3 = r1.zza()
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.compareTo(r3)
            if (r2 == 0) goto Le
            goto L49
        L35:
            int r5 = r5.zzd()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r6.zzd()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r2 = r5.compareTo(r6)
        L49:
            return r2
    }
}
