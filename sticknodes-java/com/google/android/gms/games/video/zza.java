package com.google.android.gms.games.video;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zza implements android.os.Parcelable.Creator {
    public zza() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r2 = 0
            r7 = r1
            r8 = r7
            r4 = 0
            r5 = 0
            r6 = 0
        Lb:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L4a
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L44
            r3 = 2
            if (r2 == r3) goto L3e
            r3 = 3
            if (r2 == r3) goto L38
            r3 = 4
            if (r2 == r3) goto L32
            r3 = 5
            if (r2 == r3) goto L2c
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto Lb
        L2c:
            boolean[] r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBooleanArray(r10, r1)
            r8 = r1
            goto Lb
        L32:
            boolean[] r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBooleanArray(r10, r1)
            r7 = r1
            goto Lb
        L38:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r1)
            r6 = r1
            goto Lb
        L3e:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r1)
            r5 = r1
            goto Lb
        L44:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r1)
            r4 = r1
            goto Lb
        L4a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.games.video.VideoCapabilities r10 = new com.google.android.gms.games.video.VideoCapabilities
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.games.video.VideoCapabilities[] r1 = new com.google.android.gms.games.video.VideoCapabilities[r1]
            return r1
    }
}
