package com.google.android.gms.games.multiplayer;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public class zzb implements android.os.Parcelable.Creator {
    public zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.google.android.gms.games.multiplayer.ParticipantEntity r1 = r0.zza(r1)
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.games.multiplayer.ParticipantEntity[] r1 = new com.google.android.gms.games.multiplayer.ParticipantEntity[r1]
            return r1
    }

    public com.google.android.gms.games.multiplayer.ParticipantEntity zza(android.os.Parcel r3) {
            r2 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r3)
        L4:
            int r1 = r3.dataPosition()
            if (r1 >= r0) goto L15
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r3, r1)
            goto L4
        L15:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r3, r0)
            com.google.android.gms.games.multiplayer.ParticipantEntity r3 = new com.google.android.gms.games.multiplayer.ParticipantEntity
            r3.<init>()
            return r3
    }
}
