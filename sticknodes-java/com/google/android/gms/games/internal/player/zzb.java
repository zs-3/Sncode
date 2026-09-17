package com.google.android.gms.games.internal.player;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzb implements android.os.Parcelable.Creator {
    public zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    static void zza(com.google.android.gms.games.internal.player.MostRecentGameInfoEntity r5, android.os.Parcel r6, int r7) {
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            java.lang.String r1 = r5.zze()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r2, r1, r3)
            java.lang.String r1 = r5.zzf()
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r2, r1, r3)
            long r1 = r5.zza()
            r4 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r6, r4, r1)
            android.net.Uri r1 = r5.zzd()
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r6, r2, r1, r7, r3)
            android.net.Uri r1 = r5.zzc()
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r6, r2, r1, r7, r3)
            android.net.Uri r5 = r5.zzb()
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r6, r1, r5, r7, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r0)
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r9 = r6
            r10 = r9
            r11 = r10
            r7 = r2
        Ld:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L52
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L4c;
                case 2: goto L46;
                case 3: goto L40;
                case 4: goto L36;
                case 5: goto L2c;
                case 6: goto L22;
                default: goto L1e;
            }
        L1e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r1)
            goto Ld
        L22:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            android.net.Uri r1 = (android.net.Uri) r1
            r11 = r1
            goto Ld
        L2c:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            android.net.Uri r1 = (android.net.Uri) r1
            r10 = r1
            goto Ld
        L36:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r13, r1, r2)
            android.net.Uri r1 = (android.net.Uri) r1
            r9 = r1
            goto Ld
        L40:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r1)
            r7 = r1
            goto Ld
        L46:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r1)
            r6 = r1
            goto Ld
        L4c:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r1)
            r5 = r1
            goto Ld
        L52:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r0)
            com.google.android.gms.games.internal.player.MostRecentGameInfoEntity r13 = new com.google.android.gms.games.internal.player.MostRecentGameInfoEntity
            r4 = r13
            r4.<init>(r5, r6, r7, r9, r10, r11)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.games.internal.player.MostRecentGameInfoEntity[] r1 = new com.google.android.gms.games.internal.player.MostRecentGameInfoEntity[r1]
            return r1
    }
}
