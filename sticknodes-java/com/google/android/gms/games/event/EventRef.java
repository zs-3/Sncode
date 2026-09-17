package com.google.android.gms.games.event;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class EventRef extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.event.Event {
    EventRef(com.google.android.gms.common.data.DataHolder r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.games.event.EventEntity.zzc(r0, r1)
            return r1
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.event.Event freeze() {
            r1 = this;
            com.google.android.gms.games.event.EventEntity r0 = new com.google.android.gms.games.event.EventEntity
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public final java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = "description"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public final void getDescription(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = "description"
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.event.Event
    public final java.lang.String getEventId() {
            r1 = this;
            java.lang.String r0 = "external_event_id"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public final java.lang.String getFormattedValue() {
            r1 = this;
            java.lang.String r0 = "formatted_value"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public final void getFormattedValue(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = "formatted_value"
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.event.Event
    public final android.net.Uri getIconImageUri() {
            r1 = this;
            java.lang.String r0 = "icon_image_uri"
            android.net.Uri r0 = r1.parseUri(r0)
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public java.lang.String getIconImageUrl() {
            r1 = this;
            java.lang.String r0 = "icon_image_url"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "name"
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public final void getName(android.database.CharArrayBuffer r2) {
            r1 = this;
            java.lang.String r0 = "name"
            r1.copyToBuffer(r0, r2)
            return
    }

    @Override // com.google.android.gms.games.event.Event
    public final com.google.android.gms.games.Player getPlayer() {
            r4 = this;
            com.google.android.gms.games.PlayerRef r0 = new com.google.android.gms.games.PlayerRef
            com.google.android.gms.common.data.DataHolder r1 = r4.mDataHolder
            int r2 = r4.mDataRow
            r3 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public final long getValue() {
            r2 = this;
            java.lang.String r0 = "value"
            long r0 = r2.getLong(r0)
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
            r1 = this;
            int r0 = com.google.android.gms.games.event.EventEntity.zza(r1)
            return r0
    }

    @Override // com.google.android.gms.games.event.Event
    public final boolean isVisible() {
            r1 = this;
            java.lang.String r0 = "visibility"
            boolean r0 = r1.getBoolean(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.android.gms.games.event.EventEntity.zzb(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.google.android.gms.games.event.EventEntity r0 = new com.google.android.gms.games.event.EventEntity
            r0.<init>(r1)
            r0.writeToParcel(r2, r3)
            return
    }
}
