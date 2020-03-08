package 中介者模式.smarthouse;

import 中介者模式.smarthouse.被控制的机器.AMachine;
import 中介者模式.smarthouse.被控制的机器.BMachine;
import 中介者模式.smarthouse.被控制的机器.CMachine;
import 中介者模式.smarthouse.被控制的机器.Colleague;

import java.util.HashMap;

// 具体的中介者
public class ConcreteMediator extends Mediator {
    //放入所有被中介者控制的机器
    private HashMap<String, Colleague> machineMap;

    public ConcreteMediator() {
        machineMap = new HashMap<String, Colleague>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        machineMap.put(colleagueName, colleague);
    }

    // 具体中介者的核心方法
    // 根据得到的消息完成对应的任务
    // 中介者在这个方法中协调各个具体机器对象完成任务
    @Override
    public void GetMessage(int stateChange, String colleagueName) {
        AMachine aMachine = (AMachine) machineMap.get("AMachine");
        BMachine bMachine = (BMachine) machineMap.get("BMachine");
        CMachine cMachine = (CMachine) machineMap.get("CMachine");
        // 当A机器首先发出信号
        if (machineMap.get(colleagueName) instanceof AMachine) {
            if (stateChange == 0) {
                aMachine.startAMachine();
                bMachine.startBMachine();
                cMachine.startCMachine();
            } else if (stateChange == 1) {
                bMachine.stopBMachine();
                cMachine.stopCMachine();
                aMachine.stopAMachine();
            }
        }
        // 当B机器首先发出指令
        else if (machineMap.get(colleagueName) instanceof BMachine) {

        } else if (machineMap.get(colleagueName) instanceof CMachine) {

        }

    }

    @Override
    public void SendMessage() {

    }

}
