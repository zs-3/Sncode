package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
final class zzw extends com.google.android.gms.internal.common.zzz {
    final /* synthetic */ com.google.android.gms.internal.common.zzr zza;

    zzw(com.google.android.gms.internal.common.zzx r1, com.google.android.gms.internal.common.zzaa r2, java.lang.CharSequence r3, com.google.android.gms.internal.common.zzr r4) {
            r0 = this;
            r0.zza = r4
            r0.<init>(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.common.zzz
    final int zzc(int r1) {
            r0 = this;
            int r1 = r1 + 1
            return r1
    }

    @Override // com.google.android.gms.internal.common.zzz
    final int zzd(int r5) {
            r4 = this;
            java.lang.CharSequence r0 = r4.zzb
            int r1 = r0.length()
            java.lang.String r2 = "index"
            com.google.android.gms.internal.common.zzv.zzb(r5, r1, r2)
        Lb:
            if (r5 >= r1) goto L1d
            com.google.android.gms.internal.common.zzr r2 = r4.zza
            char r3 = r0.charAt(r5)
            boolean r2 = r2.zza(r3)
            if (r2 == 0) goto L1a
            goto L1e
        L1a:
            int r5 = r5 + 1
            goto Lb
        L1d:
            r5 = -1
        L1e:
            return r5
    }
}
