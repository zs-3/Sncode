package com.google.android.datatransport.runtime.scheduling.persistence;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class PersistedEvent {
    public PersistedEvent() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent create(long r1, com.google.android.datatransport.runtime.TransportContext r3, com.google.android.datatransport.runtime.EventInternal r4) {
            com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_PersistedEvent r0 = new com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_PersistedEvent
            r0.<init>(r1, r3, r4)
            return r0
    }

    public abstract com.google.android.datatransport.runtime.EventInternal getEvent();

    public abstract long getId();

    public abstract com.google.android.datatransport.runtime.TransportContext getTransportContext();
}
