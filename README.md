# kerone
The purpose of the demo is to present the mechanism of micro-kernel / DPR in a GUI software. The demonstration includes:
  The execution of guest tasks in virtual machine (i.e. task ID, time).
  The states and steps of virtual machine scheduling (i.e. VM ID, priority, time).
  The states and steps of DPR accelerator (i.e. current accelerator, current virtual machine, reconfiguration time, physical postion on FPGA)

In the GUI, users can choose different debug mode, select specific steps that they want to observe, and save/load configurations and results in save files.

Accorfing to the discussion, the demo envrionment is:
  Development with Java.
  Communication with ZedBoard via UART interface.
  Refresh the graphic dmonstration at run time.

In the first step, we can imagine a simple version which can be easier to implement. Meanwhile we can leave adaptiable interfaces where we can later add the optional functions.
