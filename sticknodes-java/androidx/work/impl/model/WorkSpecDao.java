package androidx.work.impl.model;

@android.annotation.SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public interface WorkSpecDao {
    void delete(java.lang.String r1);

    java.util.List<androidx.work.impl.model.WorkSpec> getAllEligibleWorkSpecsForScheduling(int r1);

    java.util.List<androidx.work.impl.model.WorkSpec> getEligibleWorkForScheduling(int r1);

    java.util.List<androidx.work.Data> getInputsFromPrerequisites(java.lang.String r1);

    java.util.List<androidx.work.impl.model.WorkSpec> getRecentlyCompletedWork(long r1);

    java.util.List<androidx.work.impl.model.WorkSpec> getRunningWork();

    java.util.List<androidx.work.impl.model.WorkSpec> getScheduledWork();

    androidx.work.WorkInfo.State getState(java.lang.String r1);

    java.util.List<java.lang.String> getUnfinishedWorkWithName(java.lang.String r1);

    java.util.List<java.lang.String> getUnfinishedWorkWithTag(java.lang.String r1);

    androidx.work.impl.model.WorkSpec getWorkSpec(java.lang.String r1);

    java.util.List<androidx.work.impl.model.WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(java.lang.String r1);

    boolean hasUnfinishedWork();

    int incrementWorkSpecRunAttemptCount(java.lang.String r1);

    void insertWorkSpec(androidx.work.impl.model.WorkSpec r1);

    int markWorkSpecScheduled(java.lang.String r1, long r2);

    int resetScheduledState();

    int resetWorkSpecRunAttemptCount(java.lang.String r1);

    void setOutput(java.lang.String r1, androidx.work.Data r2);

    void setPeriodStartTime(java.lang.String r1, long r2);

    int setState(androidx.work.WorkInfo.State r1, java.lang.String... r2);
}
