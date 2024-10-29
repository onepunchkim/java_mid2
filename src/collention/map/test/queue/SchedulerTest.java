package collention.map.test.queue;

public class SchedulerTest {
    public static void main(String[] args) {
        //낮에 작업을 저장
        TaskSchduler schduler = new TaskSchduler();
        schduler.addTask(new CompressionTask());
        schduler.addTask(new BackupTask());
        schduler.addTask(new CleanTask());

        //새벽 시간에 실행
        System.out.println("작업 시작");
        run(schduler);
        System.out.println("작업 완료");
    }

    private static void run(TaskSchduler schduler) {
        while (schduler.getRemainingTasks() > 0) {
            schduler.processNextTask();
        }
    }
}
