package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzr extends com.google.android.gms.games.zzs {
    zzr() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.games.zzs, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.google.android.gms.games.PlayerEntity r1 = r0.zza(r1)
            return r1
    }

    @Override // com.google.android.gms.games.zzs
    public final com.google.android.gms.games.PlayerEntity zza(android.os.Parcel r32) {
            r31 = this;
            java.lang.Integer r0 = com.google.android.gms.games.PlayerEntity.zzk()
            boolean r0 = com.google.android.gms.games.PlayerEntity.zzm(r0)
            if (r0 != 0) goto L6c
            java.lang.Class<com.google.android.gms.games.PlayerEntity> r0 = com.google.android.gms.games.PlayerEntity.class
            java.lang.String r0 = r0.getCanonicalName()
            boolean r0 = com.google.android.gms.games.PlayerEntity.zzn(r0)
            if (r0 == 0) goto L17
            goto L6c
        L17:
            java.lang.String r2 = r32.readString()
            java.lang.String r3 = r32.readString()
            java.lang.String r0 = r32.readString()
            java.lang.String r1 = r32.readString()
            long r6 = r32.readLong()
            java.lang.String r18 = r32.readString()
            java.lang.String r19 = r32.readString()
            com.google.android.gms.games.PlayerEntity r30 = new com.google.android.gms.games.PlayerEntity
            r4 = 0
            if (r0 != 0) goto L3a
            r0 = r4
            goto L3e
        L3a:
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L3e:
            if (r1 != 0) goto L42
            r5 = r4
            goto L47
        L42:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r5 = r1
        L47:
            r8 = -1
            r9 = -1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 1
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = -1
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r1 = r30
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29)
            return r30
        L6c:
            com.google.android.gms.games.PlayerEntity r0 = super.zza(r32)
            return r0
    }
}
