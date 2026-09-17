package androidx.work.impl.constraints;

/* loaded from: classes.dex */
public interface WorkConstraintsCallback {
    void onAllConstraintsMet(java.util.List<java.lang.String> r1);

    void onAllConstraintsNotMet(java.util.List<java.lang.String> r1);
}
